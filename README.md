# StatusBarView
Two simple Android views with the size of the device's Status Bar and Navigation Bar.

## Usage:

### Adding the depencency

Add this to your root *build.gradle* file:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Now add the dependency to your app build.gradle file:

```
compile 'com.github.marcoscgdev:StatusBarView:1.0.0'
```

### Using the views

```xml
<com.marcoscg.statusbarview.StatusBarView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@android:color/black"/>
```
```xml
<com.marcoscg.statusbarview.NavigationBarView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@android:color/black"/>
```
