#Q2.1
docker stop $(docker ps -aq)
docker rm $(docker ps -aq)

#Q2.2
docker system prune
docker volume prune
