const readline = require('readline')

var input = readline.createInterface({
	input: process.stdin,
	output: process.stdout
})

function testSort() {
	console.log("hi")
}

input.on('line', (line) => {
	console.log(line);
})