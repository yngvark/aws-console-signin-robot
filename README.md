# aws-console-signin-robot
A tool that logs in to a specified account number

## Installation

Clone this repo and run

```bash
./gradlew shadowJar
```

As for usage, there are alternatives. The one that I currently use is the following:

### Usage alternative: Put shortcut on the application menu

```bash
wget https://raw.githubusercontent.com/yngvark/aws-console-signin-robot/main/aws-console-login -O /usr/local/bin/aws-console-login


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
