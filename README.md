# aws-console-signin-robot
A tool that logs in to a specified account number

## Requirements

* Java, at least version 12
  * Tip: Use SDKMAN and run `sdk i java 14.0.2-zulu`.
  * You also need to update the script `aws-console-login`, replace `someuser` with your username.
  * Or, delete the SDKMAN setup with something that works on your machine.

## Installation

Clone this repo and run

```bash
git clone git@github.com:yngvark/aws-console-signin-robot.git

cd aws-console-signin-robot
./gradlew shadowJar

wget https://raw.githubusercontent.com/yngvark/aws-console-signin-robot/main/aws-console-login -O /usr/local/bin/aws-console-login
sed -i "s/someuser/$USER/g" /usr/local/bin/aws-console-login
export CURDIR="`pwd`"
sed -i "s&path_to_this_repo&$CURDIR&" /usr/local/bin/aws-console-login
chmod +x /usr/local/bin/aws-console-login
```

Now, in the file aws-console-login, replace `path_to_this_repo` with the path to where you cloned this repository

As for usage, there are alternatives. The one that I currently use is the following:

### Usage alternative: Put shortcut on the application menu

```bash
```




cat <<EOF >>~/.local/share/applications/my-aws-account-dev
[Desktop Entry]
Version=1.0
Type=Application
Name=aws-login-myaccount-dev
Exec=/usr/local/bin/aws-console-login 123456789012
Categories=Development;
Terminal=false
EOF
```

### Usage alternative: Run command manually to test

This will probably not be useful, as the java program immediately starts pressing keys. But at least you
will see that it works.

```