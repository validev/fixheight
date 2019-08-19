#!/bin/bash
classname=DataOsdGetPushCommon
javac $classname.java
mv $classname.class dji/midware/data/model/P3
~/Android/Sdk/build-tools/28.0.3/dx --dex --output=classes.dex dji/midware/data/model/P3/$classname.class
#rm $classname.class
java -jar smali/baksmali-2.2.6.jar dis classes.dex
rm classes.dex
mv out/dji/midware/data/model/P3/$classname.smali .
rm -rf out
