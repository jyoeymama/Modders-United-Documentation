# Modders-United-Documentation
<img width="254" height="254" alt="Modders United" src="https://github.com/user-attachments/assets/2d4b0234-1a47-4078-871b-3431672727bb" />

```
 __       __                  __        __                                      __    __            __    __                      __ 
/  \     /  |                /  |      /  |                                    /  |  /  |          /  |  /  |                    /  |
$$  \   /$$ |  ______    ____$$ |  ____$$ |  ______    ______    _______       $$ |  $$ | _______  $$/  _$$ |_     ______    ____$$ |
$$$  \ /$$$ | /      \  /    $$ | /    $$ | /      \  /      \  /       |      $$ |  $$ |/       \ /  |/ $$   |   /      \  /    $$ |
$$$$  /$$$$ |/$$$$$$  |/$$$$$$$ |/$$$$$$$ |/$$$$$$  |/$$$$$$  |/$$$$$$$/       $$ |  $$ |$$$$$$$  |$$ |$$$$$$/   /$$$$$$  |/$$$$$$$ |
$$ $$ $$/$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |$$    $$ |$$ |  $$/ $$      \       $$ |  $$ |$$ |  $$ |$$ |  $$ | __ $$    $$ |$$ |  $$ |
$$ |$$$/ $$ |$$ \__$$ |$$ \__$$ |$$ \__$$ |$$$$$$$$/ $$ |       $$$$$$  |      $$ \__$$ |$$ |  $$ |$$ |  $$ |/  |$$$$$$$$/ $$ \__$$ |
$$ | $/  $$ |$$    $$/ $$    $$ |$$    $$ |$$       |$$ |      /     $$/       $$    $$/ $$ |  $$ |$$ |  $$  $$/ $$       |$$    $$ |
$$/      $$/  $$$$$$/   $$$$$$$/  $$$$$$$/  $$$$$$$/ $$/       $$$$$$$/         $$$$$$/  $$/   $$/ $$/    $$$$/   $$$$$$$/  $$$$$$$/ 
```

Welcome to the Modders United Documentation where everything related to Modders United and modding games is here! Modders United is a Meta Horizon based community focused on creating mods and tools for VR games.       Here you can connect with like minded developers and get help when you need it. Modders United has creators who build mods for almost every VR game in existence!

TABLE OF CONTENTS:

1. Our Website
2. How to start modding in vr
3. Vr games with no anticheat
4. Vr games that I have modded
5. How to download an APK of a vr game
6. Hunting for exploits and vulns for the vr
7. Random
8. More About Information.txt and information2.txt
9. Commands for hacking the vr

OUR WEBSITE

For our website, plesae go to this link: https://jyoeymama.github.io/Modders-United-Documentation/

HOW TO START MODDING IN VR

Vr modding is some of the most fun challenge that I have ever had. Modding in vr is very complicated but can be done! Mods in games like gorilla tag are already popular and open source! Modding a game in vr usually begins with have some basic knowledge of c# and c++. Most vr games these days are coded in c# and c++, therefore you must make your mods in the same language as the game! When I start modding a game of my choiche I usually like to make sure that I have 1. a computer or laptop, 2. a usb 3.0 cable, and 3. any vr headset of your choice. The usb 3.0 cable is on amazon for as low as $15. Here is an example picture of the right cable that you need (it must have this weird end). When I have all that ready I make sure to have sidequest installed as well as a modding framework of your choice (I personally use questpatcher) Once you have sidequest installed as well as a modding framework, its time to start modding! creating a mod is a difficult task but I have found that looking at someones premade mod helps a lot for me to better understand where to start making my mod and making the main works of my mod. Then I just take that mod and compile it into a .dll or a .qmod and boom! you have sucessfully modded a vr game! Remember, this works on almost any vr game! Goodluck and happy modding!

Here is a link to download sidequest: https://sidequestvr.com/

Here is the link for questpatcher: https://github.com/Lauriethefish/QuestPatcher

HERE IS THE CABLE THAT YOU NEED:

<img width="254" height="254" alt="Screenshot 2025-10-05 194550" src="https://github.com/user-attachments/assets/50e46821-58db-432e-8aaa-59b96b9adecd" />

VR GAMES WITH NO ANTICHEAT:

For a list of vr games with no anticheat, please go to the file gameswithoutanticheat.txt. There you will find a huge list of games that has no anticheat thats updated regulary!

VR GAMES THAT I HAVE MODDED:

I have modded vr games like gorilla tag and yeeps (and a handful of gorilla tag ripoffs) WORK IN PROGRESS.

HOW TO DOWNLOAD THE APK OF A VR GAME:

Downloading a vr game is a complicated process that I had to learn over quite a while. The first thing you want to do in downloading a vr game (or apk of a game) is to run this command in powershell after connecting your headset to your pc or laptop. Also make sure that you have developer mode enabled on your account.

```
adb devices
```

if you see and output like this then you have sucessfully connected your headset to your pc:

```
Device: HK1CAW123NWDN432
```

Once you get that glorius output showing that you connected your headset, its time to find the game you want to download the apk of onto your pc using the command below.

```
adb shell pm list packages
```

Here is your expected output for that command (it will look crazy but I will explain what you are seeiing.) These are a list of example packages below:

```
package:com.oculus.home
package:com.oculus.systemutilities
package:com.oculus.vrshell
package:com.oculus.browser
package:com.oculus.socialplatform
package:com.oculus.horizon
package:com.oculus.mediaplayer
package:com.oculus.tv
package:com.oculus.questlauncher
package:com.google.android.gms
package:com.google.android.youtube
package:com.example.mycustomapp
```

Then, once you get that output; that output will show you all the packages or apps on your headset. To find the vr game that you would like to mod, look for keywords in the package that could show that the certian package that you need is the package (or apk) of the game that you need to download. For example if I want to download a game called jyomama28isthebest then I would try to look for a package named Com.jyomama28isthebest or something. Then once you have all that down, its time to install the apk onto your pc!

To find the package location, run this command below:

```
adb shell pm path <package_name>
adb pull /data/app/com.jyomama28isthebest-1/base.apk C:\Users\Jyomama28\Desktop
```

once you run that command, you should see an output sort of like this (it varies for every package or game.):

```
package:/data/app/com.jyomama28isthebest-1/base.apk
```

After downloading your apk (it will be named base.apk at the start but thats totally normal) you can rename it to anything you like! just make sure to change the end from .apk to .zip and there you will have all the asset files and source code of that certian game! You have sucessfully installed an apk of a game onto your pc! :) Remember, have fun and happy hacking!

HUNTING FOR EXPLOITS AND VULNS FOR THE VR:

RANDOM:

<p align="center">
  <strong style="margin:0 8px">JYOMAMA28 IS THE KING OF VR HACKING! MODDERS UNITED IS ON TOP!</strong>
</p>

MORE ABOUT INFORMATION.TXT

Information.txt is a quick glossary that sums up everything in this repo. It explains about old vulnrabillites, hunting for exploits (using fuzzers), and much more! 

COMMANDS FOR HACKING THE VR:

```
adb devices
```
adb devices list the devices connected to your pc/laptop. Must have developer mode enabled on your account.

```
adb shell pm list packages
```

this will list all the packages that are found on your device.

```
adb pull <package name>
```

this will pull the package/app onto your pc/laptop.

THESE NEXT COMMANDS USES A TOOL CALLED FRIDA, DOWNLOAD FRIDA AT THIS LINK: https://github.com/frida/frida

```
frida -U -f com.your.app.package -l # (yourfile.anylanguage) for example attach.js
```
This will let you try to attach other custom scripts onto a package or app

```
frida-ps -U
```

This will show you all the packages or apps that you have on your device. This should show you a PID number and the name of the package or app.

```
frida -U -p <YOURPIDNUMBER> -l # (yourfile.anylanguage) for example attach.js
```

This will let you try to attach a custom script using the PID number.

```
adb shell example -p com.your.package.app 1
```

This will download your package/app onto your pc. 

```
adb shell pidof com.your.package.app
```

This will show you the PID number of your package or app using frida.

