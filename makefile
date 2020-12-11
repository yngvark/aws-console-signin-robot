.PHONY: help
help: ## Print this menu
	@grep -E '^[a-zA-Z_0-9-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

init: ## -
	@echo See pre-requiesites in README

install: compile ## - Installs the program on your local file system, to /usr/local/bin
	cp aws-console-login /usr/local/bin/aws-console-login
	sed -i "s/someuser/$USER/g" /usr/local/bin/aws-console-login
	export CURDIR=`pwd`
	sed -i "s&path_to_this_repo&$CURDIR&" /usr/local/bin/aws-console-login

compile: ## -
	./gradlew shadowJar

run: compile ## -
	@echo "RUN using: java -jar build/libs/*.jar <AWS Account ID>"
