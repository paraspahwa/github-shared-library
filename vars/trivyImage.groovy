def call() {
    sh 'trivy image paraspahwa/youtube:latest > trivyimage.txt'
}
