
Startup splash screen
---------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/splash](http://artifacts.griffon-framework.org/plugin/splash)


Provides a splash screen that is displayed during initialization of Griffon. The plugin provides the for a custom image and 
status text.

Usage
-----

The splash screen can be displayed by calling

        SplashGriffonAddon.display(app)

This code is usually placed inside `griffon-app/lifecycle/Initialize.groovy` as that's the lifecycle script that will be called
first when the application startups.

### Setting an Image

You can configure a diffrent image to show inside `griffon-app/conf/Config.groovy`

        splash.image = 'mysplash.jpg'

### Updating Status

Updating the status text can be done at anytime while the Splash screen is shown, like this

    griffon.plugins.splash.SplashScreen.instance.showStatus("Initializing the Controller")

