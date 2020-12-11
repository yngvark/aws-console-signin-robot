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

As for usage, there are alternatives. The one that I currently use is the following:

### Usage alternative: Put shortcut on the application menu

```bash
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

XXX