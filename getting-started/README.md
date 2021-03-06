<!---
	Description file for COMP 2210 Hands-On: Getting Started.
	Introduces basic requirements and procedures for lab.

	@author:  Dean Hendrix <dh@auburn.edu>
	@version: 2018-01-11
-->

# Hands-On: Getting Started

You are asked to perform several activities that will help you prepare for the COMP 2210 assignments. Although this is not part of your calculated course grade, you are strongly encouraged to complete each task. Be sure to ask your TA questions if you have trouble.


## Canvas

Navigate within Canvas and familiarize yourself with the organization of the course and the materials that are provided. In particular, be sure to:

1. Read the official course syllabus.
1. Register for and log in to Piazza.
1. Familiarize yourself with the module structure for the course.
1. Complete everything in *M0 - Welcome to the Course*.
1. Make sure you can find all the course notes, both within the modules and under the Files link.
1. Make sure your Canvas account Notification Preferences are what you want. At a minimum, you are required to have all course announcements sent to your TigerMail immediately.


## Directory Structure and File Storage

Using the Engineering network drive to store your work is not required, but it is strongly encouraged. If you store all your work on the Engineering drive, you will always have your files backed up and available anywhere, anytime.

1. Open your Engineering H: drive.
2. Create a folder named `COMP2210`.
3. Open `COMP2210` and create the following subdirectories, plus any others you may want.
	- `hands-on`
	- `assignments`
	- `notes`
	- `tools`
4. Repeat the steps above on your own machine if you will be using it for completing work in this course.
	- I would also recommend using a free backup and synchronization service like Dropbox (`dropbox.com`), Box (`box.com`), or other similar service. You **never** want to be in the situation of losing all the work you've put in on an assignment.
	- If you want to get a head start on using a professional tool for backup, synchronization, and more, then you could explore the use of `git` (see `https://git-scm.com/`). This carries a steep learning curve and isn't necessary for 2210 so ... *caveat discipulus*.
		- If you use `git` you may also want to use a web-based code hosting service like GitHub. I support the use of hosting services, but all assignment-related code must be kept strictly in **private** repositories during the semester. Although GitHub offers free private repos, there are hoops to jump through. I would recommend either GitLab or Bitbucket for relatively painless and free private repos.
5. If you will be using your own computer or other off-campus computers to complete course work, refer to the following link to see how to keep your local files in sync with the Engineering drive.
	- [`http://eng.auburn.edu/admin/ens/helpdesk/off-campus/index.html`](http://eng.auburn.edu/admin/ens/helpdesk/off-campus/index.html)


## jGRASP

1. If you are working on your own computer, download and install the latest version of jGRASP from [jgrasp.org](http://jgrasp.org). If you already have jGRASP installed on your own computer, be sure to update to the latest version.
1. Launch jGRASP. 
	- You will need to perform the following steps on each machine that you use (e.g., lab and personal).
1. Use the *Settings* menu to configure the following features, and others if desired.
	- *Auto Update*: Select *Check for New Versions* -> *Automatically Check*. If this option is checked, jGRASP checks for a new version once per day and gives you the opportunity to install the new version immediately. This is recommended.
	- *Auto Save*: If this option is checked, modified files are saved before a compile operation.
	- *Auto Compile*: If this option is checked, files and projects will be compiled before a run or debug operation.
	- *CSD Window Settings > Auto Generate CSD*: If this option is checked, a CSD is generated automatically when a file is loaded, edited, compiled, etc.
	- *Look And Feel*: This option allows you to select an overall look-and-feel for the windows, menus, etc.


## JUnit

*Note: The Engineering lab machines have JUnit already installed and jGRASP will by default have this plugin configured. For your own machine, you will have to download and unzip JUnit first and then configure this plugin with the steps below.*
1. Create the following directory: `COMP2210/tools/junit`.
1. Download to the directory you just created the two jar files (`junit.jar` and `hamcrest-core.jar`) from the latest stable release of JUnit 4 (4.12) available at the following URL.
	- [`https://github.com/junit-team/junit/wiki/Download-and-Install`](https://github.com/junit-team/junit/wiki/Download-and-Install)
1. In jGRASP, use the *Tools* menu to configure the **JUnit plugin**.
	- Select *Tools > JUnit > Configure*.
	- Set "JUnit Home" to the `COMP2210/tools/junit/` directory.
	- Click *Ok*.


## Checkstyle

*Note: The Engineering lab machines have Checkstyle already installed and jGRASP will by default have this plugin configured. For your own machine, you will have to download and unzip Checkstyle first and then configure this plugin with the steps below. Also, you will have to configure the lab machines to use the correct checks file below.*
1. Create the following directory: `COMP2210/tools/checkstyle`.
1. Download to the directory you just created the jar file `checkstyle-8.1-all.jar` (the latest stable release of Checkstyle) or `checkstyle-6.13-all.jar` (the version Vocareum is using), both of which are available at the following URL.
	- [`http://sourceforge.net/projects/checkstyle/files/checkstyle/`](http://sourceforge.net/projects/checkstyle/files/checkstyle/)
1. Download the XML file below and save it in the `checkstyle` directory you created. **This is the checks file that will be used in assignment grading.**
	- [`2210.google_checks.xml`](https://raw.githubusercontent.com/hendrtd/comp2210/master/coding_style_guidelines/2210.google_checks.xml)
1. In jGRASP, use the *Tools* menu to configure the **Checkstyle plugin**.
	- Select *Tools > Checkstyle > Configure*.
	- Set "Checkstyle Home" to the `COMP2210/tools/checkstyle/` directory.
	- Set "Checks File" to the `2210.google_checks.xml` file.
	- Click *Ok*.

Note that the XML checks file that we're using is a slightly modified version of the Checkstyle checks for the Java coding style conventions published by Google.
- You should read through the style documentation here:
	- [`http://google.github.io/styleguide/javaguide.html`](http://google.github.io/styleguide/javaguide.html)
- You should also familiarize yourself with a more general expectation of coding style and practice for this course:
    - [`https://github.com/hendrtd/comp2210/blob/master/coding_style_guidelines/guidelines.md`](https://github.com/hendrtd/comp2210/blob/master/coding_style_guidelines/guidelines.md)


## Access the provided source code for this activity

1. Open the `hands-on` directory and create a subdirectory named `getting-started`.
1. Download the file below to the `COMP2210/hands-on/getting-started/` directory you created. The easiest way to download the file will be to click on the hyperlink below, then in the resulting window click on the *Raw* button to load a plain-text version in the browser window, and then right-click in the window and choose the *Save as ...* option. Make sure you save it as `WarEagle.java`.
	- [`WarEagle.java`](src/WarEagle.java)


## Vocareum

1. Read the instructions provided in the COMP 2210 course in Canvas to ensure that you can log in to Vocareum.
    - Note that to use Vocareum after the initial grace period, you must pay the $20 usage fee for the semester. Instructions for payment are in Canvas.
1. Access Vocareum from the Hands-on: Getting Started page from within Canvas. (Note that Vocareum requires you to access each hands-on or assignment through Canvas first. After that, you can access things directly through Vocareum.)
1. Click on *Hands-On: Getting Started* in the left menu.
1. Click on *My Work*.
1. Click on *Upload* in the left pane of the workbench and follow the instructions to upload the `WarEagle.java` file.
	- If the `work` folder is not highlighted in the left pane, you'll have to click on it first before clicking on *Upload*.
1. Click *Submit*.
1. The submission report will be shown in the terminal pane at the bottom and it will be available under *Details* -> *View Submission Report*.
	- The submission report is simply the output of compiling, running a checkstyle audit, and executing JUnit tests. It is exactly what you would see at the command line if you were doing this yourself.
	- The submission report doesn't show a grade, but it does show you how many tests were run and how many of those passed.
1. Grading is done with a different script and happens automatically upon submission. You should notice that a yellow-highlighted *Graded* designation has appeared next to the `LatestSubmission` folder in the left pane.
	- You can see your grade by going back to the *Hands-On: Getting Started* page (just click on it at the top).
	- Vocareum automatically sends your grade to Canvas, so you should also be able to check in Canvas to see your current grade for any assignment.
1. From the main Vocareum page you can see grade statistics for all your assignments in a gradebook format.


## Assignment workflow

1. Open the `WarEagle.java` file in a jGRASP editor window.
1. Compile and run the file.
1. Make a few changes in the file to embed some intentional errors, including coding style issues.
1. Resubmit this file in Vocareum.
	- Pay attention to the feedback that you get from Vocareum. Interpreting this feedback is crucial to being able to understand and correct errors.
1. Correct the errors you introduced and resubmit.
1. Repeat the last few steps until you become comfortable with the workflow that you will use to submit your work to Vocareum for this course.
1. Also practice accessing and interacting with the activity in Vocareum both through Canvas and directly through Vocareum's website.


## Directory Structure

Make sure your H: drive, your local files, and your Dropbox (or whatever) files are all in sync. **Get in the habit of making this the last step in all your 2210 work sessions.**

