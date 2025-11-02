Swagger UI - http://localhost:8080/swagger-ui/index.html

H2 Console - http://localhost:8080/h2-console

docker commands
creating a image: docker build . -t <docker-username>/<name>:<tag-name>
eg: docker build . -t anaghan12345/accounts:s4
starting a container in background: docker run -d -p 8080:8080 anaghan12345/accounts:s4
list all containers: docker ps
stop a container: docker stop <container-id>
container which are in stopped status: docker ps -a
to start stopped container: docker start <container-id>



