## Installation

#### Requirements: 
 * Eclipse 4.3 (Kepler) or later.
 * A **1.7** Java VM or later. Otherwise RustDT will silently fail to start.

#### Instructions:
 1. Use your existing Eclipse, or download a new Eclipse package from http://www.eclipse.org/downloads/. 
  * For an Eclipse package without any other IDEs or extras (such a VCS tools), download the ["Platform Runtime Binary"](http://archive.eclipse.org/eclipse/downloads/drops4/R-4.4.1-201409250400/#PlatformRuntime). 
 1. Start Eclipse, go to `Help -> Install New Software...`
 1. Click the `Add...` button to add a new update site, enter the LANG_IDE_UPDATE_SITE URL in the Location field, click OK.
 1. Select the recently added update site in the `Work with:` dropdown. Type `RustDT` in the filter box. Now the RustDT feature should appear below.
 1. Select the `RustDT` feature, and complete the wizard. 
  * RustDT dependencies such as CDT will automatically be added during installation.
 1. Restart Eclipse. After that take a look at the setup section in the [User Guide](UserGuide.md#user-guide).
  

#### Updating:
If you already have RustDT installed, and want to update it to a newer release, click `Help -> Check for Updates...`.