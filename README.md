# aws-console-signin-robot

A tool that logs in to a specified account number in AWS Console. All it really does is CTRL+F on the signin
page for an AWS account ID, clicks tab and presses enter. Useful if you have tons of accounts on the signin
page and don't want to waste time finding the account.

## Requirements

* Java, at least version 12
  * Tip: Use SDKMAN and run `sdk i java 14.0.2-zulu`.
  * You also need to update the script `aws-console-login`, replace `someuser` with your username.
  * Or, delete the SDKMAN setup with something that works on your machine.

## Installation

Run

```bash
git clone https://github.com/yngvark/robothelper-lib.git
cd robothelper-lib
make publish
cd ..

git clone git@github.com:yngvark/aws-console-signin-robot.git
cd aws-console-signin-robot
make install
```

To verify that it works, run `aws-console-login 123`, and see weird stuff happening:

```bash
$ aws-console-login 123
Logging in to AWS account: 123
^F123
^[
```

That's fine, this happens because we're not in a browser.

To run the command when we're in a browser focus, there are alternatives. The one that I currently use in XFCE is
the following:

### Usage alternative: Put shortcut on the application menu

```bash
cat <<EOF >> ~/.local/share/applications/my-aws-account-dev.desktop
[Desktop Entry]
Version=1.0
Type=Application
Name=aws-login-myaccount-dev
Exec=/usr/local/bin/aws-console-login 123456789012
Categories=Development;
Terminal=false
EOF
```

### Usage alternative: With rofi

TODO
