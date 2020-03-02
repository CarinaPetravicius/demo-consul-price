# demo-consul-price
###Demo example of a Spring Boot application with Consul and Git2Consul

###### If you want to test localhost, start the consul and git2consul with command 'docker-compose up' in 'src/main/resources'.
###### In the http://localhost:8500/ui
###### you can see the Key/Value of the file properties of the project https://github.com/CarinaPetravicius/RepoGit2Consul.git.
###### after start the spring boot application, you can see the Consul discovered the tax-service-app.
###### To disable the consul, just set all the flags market as true to false in bootstrap.yml

##### environment variables to be created, to run in localhost:
INSTANCE_NAME=demo-consul-price-1
CONSUL_HOST=localhost

##### To create the docker image demo-consul-price-1, run the command in root of the project:
docker build -t demo-consul-price-1 .

##### To create the docker image demo-consul-price-2, run the command in root of the project:
docker build -t demo-consul-price-2 .

##### After create the images run the 'docker-compose up' command in root of the project, than you will have two instances of demo-consul-price running with consul service discovery.