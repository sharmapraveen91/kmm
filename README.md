# Kotlin Multiplatform Mobile (KMM) Sample App

This is a sample Kotlin Multiplatform Mobile (KMM) project that demonstrates how to share code between Android and iOS platforms. The app displays a grid of items and a detail page for each item, with shared logic for both platforms.

## Features

- Shared business logic and data models between Android and iOS.
- Android implementation using Jetpack Compose.
- iOS implementation using SwiftUI.
- Navigation between a grid of items and a detail page.

## Project Structure

The project consists of the following modules:

- `shared`: Contains the shared Kotlin code, including data models and repositories.
- `androidApp`: The Android application using Jetpack Compose for the UI.
- `iosApp`: The iOS application using SwiftUI for the UI.

## Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) with Kotlin Multiplatform Mobile plugin.
- [Xcode](https://developer.apple.com/xcode/) for iOS development.

### Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/sharmapraveen91/kmm.git
   cd KmpGridTest
   ```
2. **Open the project in Android Studio:**
	•	Launch Android Studio.
	•	Open the kmm-sample-app directory.
3. **Sync the project:**
	•	Allow Android Studio to sync the project and download the necessary dependencies.
4.	**Open the iOS project in Xcode:**
	•	Navigate to iosApp directory.
	•	Open the iosApp.xcodeproj file with Xcode.
      
#### Android Implementation

The Android app uses Jetpack Compose to display a grid of items and a detail page.

#### iOS Implementation
The iOS app uses SwiftUI to display a grid of items and a detail page.