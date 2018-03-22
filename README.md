## Agile-Projects-and-Tasks-Cloner

### This jira plugin project can selectively copy tasks from one project to another.Jira admin can also filter the tasks via issue level

This Project is developed with Spring Boot.
Spring Boot provides intelligent hot swapping. So each time you change your code, most of the time you need not to rebuild and deploy. It will automatically do it for you.


Prerequisite: Maven

git clone https://github.com/pghoshal/atlassian-connect-spring-boot.git

then install it through mvn clean install to support the dependency in 
Agile-Projects-and-Tasks-Cloner project.

then Build  Agile-Projects-and-Tasks-Cloner project, 

```
mvn clean package
```
then run the following command:

```
mvn spring-boot:run
```
Your application should start up locally on port 8080

```
If you visit http://localhost:8080/atlassian-connect.json in your browser,
you should see your add-on descriptor.
```
```
for installing plugin from your local server use ngrok for tunnelling your private ip
to public ip. Jira only supports https so take the url provided by ngrok and put it 
in atlassian-connect.json . 

Step 1: download ngrok binary.
Step 2: cd ->your ngrok.sh directory
Step 3: execute command:  ngrok http [in which port your application is running]
        example: ngrok http 8080

ngrok will print below things like that:

Tunnel Status                 online
Version                       2.1.3
Region                        United States (us)
Web Interface                 http://127.0.0.1:4040
Forwarding                    http://774ea277.ngrok.io -> localhost:8080
Forwarding                    https://774ea277.ngrok.io -> localhost:8080

Connections                   ttl     opn     rt1     rt5     p50     p90
                              31      0       0.00    0.00    56.61   78.80 
Step 4: take https url and put it in atlassian-connect.json baseurl parameter.
**** remember each time you run ngrok it will generate different url and you need
to replace the url in atlassian-connect.json baseurl parameter.

```
