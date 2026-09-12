// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  if (ProjectName == "wanderlust-frontend-beta") {
        sh 'echo \'VITE_API_PATH="http://13.58.214.45:31100"\' > .env.docker'
    }
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
