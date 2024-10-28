# CryptoTracker
CryptoTracker is a mobile application designed to provide users with real-time updates on cryptocurrency prices, market trends, and more. With a focus on providing an intuitive experience, the app supports both light and dark themes with dynamic colors for an adaptive user interface.

## Key Features

### Real-time Price Updates: 
Get live updates on cryptocurrency prices as they change, ensuring you are always up-to-date on market fluctuations. This feature helps users make timely and informed decisions in response to market dynamics.

### Market Trends: 
Track historical price data and analyze trends for selected cryptocurrencies. This allows users to better understand past performance and anticipate future market movements based on trend analysis.

### Intuitive UI: 
Built with Jetpack Compose, the app provides a modern, intuitive interface that enhances user experience through smooth interactions and a streamlined design. This UI design keeps navigation simple, making the app easy to use for both beginners and seasoned investors.

### Theming Support: 
Enjoy a personalized experience by choosing between Light and Dark themes, complemented by adaptive dynamic colors. This feature adapts the app’s appearance to the user's preferences, optimizing readability and reducing eye strain.

### Adaptive Navigation: 
Effortlessly navigate through the app with a layout that adapts to different screen sizes and orientations. Adaptive navigation ensures a responsive and clean experience, making it easy to find the desired information quickly.



## Tech Stack

### Kotlin: 
The primary language for Android development, Kotlin is chosen for its modern syntax and interoperability with Java. Its concise code structure makes the app more readable and maintainable.

### Jetpack Compose: 
As a declarative UI toolkit, Jetpack Compose simplifies the process of building complex and responsive UIs. It enables developers to write UI code that is less error-prone and more adaptable to various device screens.

### Jetpack Compose Canvas:
Leveraged Jetpack Compose Canvas to make Interactive Line chart for showing the Data points to the user.

### Material 3: 
By implementing the latest Material Design guidelines, the app achieves a cohesive and visually appealing appearance. Material 3 components ensure the app is visually consistent with modern Android apps, providing a familiar experience for users.

### Ktor: 
Ktor is used for network requests, enabling secure and efficient fetching of cryptocurrency data from APIs. Its lightweight and asynchronous capabilities make it ideal for handling real-time data needs in the app.

### Coroutines: 
Kotlin Coroutines handle asynchronous operations efficiently, ensuring smooth data processing without blocking the main thread. This results in a more responsive app, especially when fetching data or handling network requests.

### Koin: 
Koin is used for dependency injection, which helps manage and modularize the app's codebase. This makes the app more scalable and easier to maintain, as dependencies are managed in a centralized manner.

### Clean Architecture: 
Clean Architecture provides a well-organized structure that separates concerns and improves testability. By keeping each layer independent, the architecture helps ensure the app’s long-term maintainability and flexibility.

### Adaptive Navigation: 
This navigation approach allows the app to deliver a dynamic user experience by adjusting to screen sizes, orientations, and user contexts. It enhances accessibility and provides a seamless user flow across various parts of the app.
