ARG BUILDPLATFORM=linux/amd64
FROM --platform=$BUILDPLATFORM mcr.microsoft.com/devcontainers/java:17

# Prevent interactive prompts during package installation
ENV DEBIAN_FRONTEND=noninteractive

# Set workspace directory
WORKDIR /opt/app

# Update and install basic utilities
RUN apt-get update && apt-get install -y \
    curl \
    wget \
    git \
    unzip \
    software-properties-common \
    gnupg2 \
    apt-transport-https \
    ca-certificates 

# Install Gradle
ENV GRADLE_VERSION=8.12
RUN wget https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip -P /tmp && \
    unzip -d /usr/local/gradle /tmp/gradle-${GRADLE_VERSION}-bin.zip && \
    ln -s /usr/local/gradle/gradle-${GRADLE_VERSION} /usr/local/gradle/latest && \
    rm /tmp/gradle-${GRADLE_VERSION}-bin.zip
ENV PATH=$PATH:/usr/local/gradle/latest/bin

# Install Python3 and pip
RUN apt-get install -y python3 python3-pip

# Install Go
RUN wget https://go.dev/dl/go1.22.0.linux-amd64.tar.gz && \
    tar -C /usr/local -xzf go1.22.0.linux-amd64.tar.gz && \
    rm go1.22.0.linux-amd64.tar.gz
ENV PATH=$PATH:/usr/local/go/bin

# Install nvm, node LTS, and npm
ENV NVM_DIR=/root/.nvm
RUN curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.7/install.sh | bash && \
    . $NVM_DIR/nvm.sh && \
    nvm install --lts && \
    nvm use --lts

# Clean up apt
RUN rm -rf /var/lib/apt/lists/*

CMD ["/bin/bash"]