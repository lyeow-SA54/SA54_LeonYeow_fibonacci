# SA54 Fibonacci Spring RESTful web app

Docker build instructions (replace < > tags with appropriate local values):
1. navigate to correct folder level in cmd (<base folder>/fibonacci)
2. in cmd type: docker build -t < image name >:< tag name > .
3. in cmd type: docker run -p<available port on machine>:8080 < image name from 2 >:< tag name from 2 >

To run the app locally, start the project (either through local IDE after project import/docker image) and input localhost:8080/fibonacci?elements=< value >
- default port value is 8080, update as appropriate if docker run specifies a different port
  
To run the app deployed to oracle cloud, use this link in browser: 140.238.162.241:3390/fibonacci?elements=< value >
