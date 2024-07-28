# simple-java-docker
A simple java app that runs on docker 

docker build -t wanderlust-back-node:v1 .
docker build -t wanderlust-front-react:v2 .

docker run -d -v wanderlust_vol:/backend/data -p 27017:27017 --network tws --name mongo mongo:latest

docker run -d -v wanderlust_vol:/data --network tws -p 27017:27017 --name mongo mongo:latest
docker container run -d -p 5000:5000 --network tws --name backend wanderlust-back-node:v1
docker run -d -p 5173:5173 --network tws --name frontend wanderlust-front-react:v1

mongoimport --db wanderlust --collection posts --file ./data/sample_posts.json --jsonArray

docker exec -it baae40db426d mongoimport --db wanderlust --collection posts --file ./Test123/sample_posts.json --jsonArray

docker run -d -v wanderlust_vol:/backend/data -p 27017:27017 --network tws --name mongo mongo:latest

docker cp backend/data/sample_posts.json mongo:/data

GIT Push by SSH:
git remote set-url origin git@github.com:nikunjdevcloud/wanderlust.git

git push origin devops

docker rmi $(docker images -q)

Backend:
MONGODB_URI="mongodb://mongo/wanderlust"
CORS_ORIGIN="http://52.66.68.222:5000"

Frontend:
VITE_API_PATH="http://52.66.68.222:5000"

Similarly, loads the environment variables defined in ./backend/.env.sample into the frontend container.
This setup suggests that the frontend might need access to some of the same environment variables as the backend, possibly for API URLs, authentication keys, or other shared configuration settings.
