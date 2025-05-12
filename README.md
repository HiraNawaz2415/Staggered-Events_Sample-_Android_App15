# 📅 Staggered Events Sample Android App

This Android application demonstrates how to display event cards using a **StaggeredGridLayoutManager** in a `RecyclerView`. It showcases a dynamic, responsive layout often used for event listings, image galleries, or content feeds.

---

## What is a StaggeredGridLayoutManager?

`StaggeredGridLayoutManager` is a layout manager used with `RecyclerView` that allows you to display items in a staggered grid pattern, where rows or columns can have varying item heights or widths.

It is useful for:
- Displaying cards of different heights (e.g., events, blog posts)
- Creating Pinterest-style layouts
- Enhancing UI responsiveness for dynamic content

---

## Features

- Responsive staggered grid layout
- RecyclerView implementation with custom Adapter
- Displays dynamic event cards with title, image, and description
- Smooth scrolling performance
- Modern material design UI

---


## Requirements

- Android Studio
- Java SDK 8 or higher
- Android SDK 21+
- Gradle 7+

---

## ⚙️ Dependencies

In `build.gradle (Module: app)`:

```groovy
dependencies {
    implementation 'androidx.recyclerview:recyclerview:1.3.2'
    implementation 'com.google.android.material:material:1.11.0'
}
