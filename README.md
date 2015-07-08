# htmltopdf

Simple HTTP client for generating PDFs in Scala


## Install

Make sure to [Install Docker](https://docs.docker.com/installation/)

Build Development Image
```bash
docker build -t htmltopdf_dev -f Dockerfile.dev .
```

Run Development Image for Development
```bash
docker run -it -v $(pwd)/play:/root/ -p 9000:9000 htmltopdf_dev ./activator ~run
```
After it starts up, you should be able to go to ``http://localhost:9000``
_(If you're on OS X, you'll need to get the IP of your VM)_

Simple test url: ``localhost:9000?url=https://www.google.com&filename=test``


Produce Production Jar
```bash
# This will pack the application to be run on the production image.
docker run -it -v $(pwd)/play:/root/ htmltopdf_dev ./activator stage
```

# TODO
Build Production Image
```bash
docker build -t htmltopdf .
```

Run Production Image
```bash
docker run -it htmltopdf bin/htmltopdf
```

Then you can post html and title params to http://{docker_ip}:8080 and it will return a PDF.
