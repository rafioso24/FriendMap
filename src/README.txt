README

FriendMap - A map of your facebook friends all over the world

Uses
-Facebook Graph API
-Google Maps API


How to Use
1. go to the graph explorer
https://developers.facebook.com/tools/explorer

2. Click on the Get Token button in the top right of the Explorer.

3. Choose the option Get User Access Token. 

4. Check the box for read_custom_friendlists, then click the blue Get Access Token button.

5. You'll see a Facebook Login Dialog, click **OK" here to proceed.

**Update- since graph explorer v2, complete friend list is no longer available

Requirements
json-20131018.jar in the build path

Compilation
javac -cp lib/javax.json-1.0.jar Parser.java FriendMap.java



Download javax.json jar file.
As you have downloaded this jar file, specify it in java compiler classpath, using javac -classpath key.
As you have your code compiled, then use -cp key for java command to specify this jar file in the runtime classpath upon your code execution.
