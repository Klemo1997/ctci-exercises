# Cracking the coding interview - exercise solutions

## Description

This project has an educational purpose on mastering algorithms and data structures by examples in various categories.

- Purpose of this repository is to share my solutions to book's exercises from Chapter IX
- If there are any typos or errors don't hesitate to make a pull request with a proposed fixes

## Installation
No installations needed, only prerequisity is docker.
Just run:
```bash
sh docker-bash.sh
```

## Credits

The exercises are from book [Cracking the Coding Interview: 189 Programming Questions and Solutions 6th Edition](https://www.goodreads.com/book/show/55014663-cracking-the-coding-interview) - Chapter IX.

## License

MIT License

Copyright (c) 2023 @Klemo1997

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

---

## Tests
Simply run this in container:
```bash
gradle test
```
Or to do it without executing bash process in container: 
```bash
docker run --rm -it -u gradle -v "$PWD":/home/gradle/project -w /home/gradle/project gradle gradle test
```