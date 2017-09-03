# StatusBarView
Two simple Android views with the size of the device's Status Bar and Navigation Bar.

|Stock|MIUI|
|---|---|
|<img src="https://raw.githubusercontent.com/marcoscgdev/StatusBarView/master/device-2017-09-03-180319.png" width="350">|<img src="https://raw.githubusercontent.com/marcoscgdev/StatusBarView/master/photo_2017-09-03_18-10-17.jpg" width="350">|

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
