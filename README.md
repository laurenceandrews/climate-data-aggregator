# 🌍 Real-Time Climate Data Aggregator & Alert System

## 📄 Overview
The Real-Time Climate Data Aggregator & Alert System is a web-based project aimed at aggregating, analyzing, and alerting users about real-time climate conditions. It gathers climate data from multiple sources, processes it for anomalies or thresholds, and notifies users of significant changes in climate patterns. This tool is intended to be a valuable resource for monitoring severe weather conditions and understanding climate trends in specific areas.

## 🛠️ Technologies Used
- **Data Ingestion**: Apache NiFi
- **Backend Development**: Kotlin, Spring Boot, Ehcache
- **API**: FastAPI, REST, GraphQL
- **Frontend**: React.js, Node.js, Vite
- **Testing**: Selenium

## 📂 Project Structure
- `nifi/`: Contains configuration files for Apache NiFi processors and flows, responsible for ingesting climate data from external sources.
- `backend/`: Main backend folder, using Kotlin and Spring Boot to create REST and GraphQL endpoints for climate data management and alert configurations.
- `frontend/`: Frontend project developed with React.js and Vite, providing an interactive dashboard for climate data visualization and alert subscriptions.
- `requirements.txt`: Lists Python dependencies necessary for API interaction and testing.
- `venv/`: Virtual environment for managing Python dependencies in isolation.

## ⭐ Features
- **Real-Time Climate Data Aggregation**: Continuously collects data from multiple climate sources, processes it, and makes it available through APIs.
- **User-Configurable Alerts**: Allows users to set thresholds for climate conditions and receive alerts when these thresholds are crossed.
- **GraphQL Query Support**: Provides flexible, customizable access to climate data based on user-defined parameters.
- **Interactive Dashboard**: Displays live data visualizations and allows users to monitor climate trends and manage alerts.
- **Modular Data Flow Management**: Uses NiFi for easy configuration and monitoring of data pipelines.

## 📋 Data Processed
The application handles and processes the following types of data:
- **Temperature**
- **Rainfall**
- **Air Quality Index (AQI)**
- **Wind Speed and Direction**
- **Severe Weather Alerts**

### 🔔 Real-Time Alerts
The app provides an alert management feature where users can set specific criteria (such as a maximum temperature or AQI threshold) and receive notifications if these criteria are met.

## 🌱 Setup and Installation

### 📋 Requirements
- **Java 8+**: Required for running Apache NiFi and Spring Boot
- **Python 3.8+**: Required for running API scripts and testing
- **Node.js and npm**: Required for the frontend application

### 🚀 Getting Started
1. **Clone the repository**:
    ```bash
    git clone git@github.com-laurenceandrews:laurenceandrews/climate-data-aggregator.git
    cd climate-data-aggregator
    ```

2. **Set up a virtual environment**:
    ```bash
    python -m venv .venv
    ```

3. **Activate the virtual environment**:
   - On Windows:
     ```bash
     .venv\Scripts\activate
     ```
   - On macOS/Linux:
     ```bash
     source .venv/bin/activate
     ```

4. **Install the required Python packages**:
    ```bash
    pip install -r requirements.txt
    ```

5. **Set up the Frontend**:
    - Navigate to the `frontend` directory:
      ```bash
      cd frontend
      ```
    - Install frontend dependencies:
      ```bash
      npm install
      ```

6. **Start Apache NiFi**:
   - Navigate to your NiFi installation directory and start NiFi:
     ```bash
     # On Windows
     bin/nifi.bat start

     # On macOS/Linux
     ./nifi.sh start
     ```
   - Access the NiFi UI at `http://localhost:8080/nifi` to configure data flows.

7. **Run the Backend**:
   - Navigate to the `backend` directory and start the Spring Boot application using Kotlin.

8. **Run the Frontend Application**:
   - From within the `frontend` directory, start the Vite development server:
     ```bash
     npm run dev
     ```

## 📝 Contributing
Contributions are encouraged! Feel free to fork this repository and submit pull requests with new features, improvements, or bug fixes.

## 📜 License
This project is licensed under the MIT License – see the LICENSE file for details.