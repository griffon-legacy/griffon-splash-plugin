/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Jim Shingler
 */
class SplashGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-splash-plugin'

    List authors = [
        [
            name: 'Jim Shingler',
            email: 'ShinglerJim@gmail.com'
        ],
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Startup splash screen"
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
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
'''
}