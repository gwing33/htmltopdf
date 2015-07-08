# htmltopdf

Simple HTTP client for generating PDFs in Scala


## Install

Make sure to [Install Docker](https://docs.docker.com/installation/)

Build Development Image
```
docker build -t htmltopdf_dev -f Dockerfile.dev .
```

Run Development Image
```
docker run -it -v $(pwd)/play:/root/ -p 9000:9000 htmltopdf_dev activator run
```

# TODO
Build Production Image
```
docker build -t htmltopdf .
```

Run Production Image
```
docker run -it htmltopdf
```

Then you can post html and title params to http://{docker_ip}:8080 and it will return a PDF.
