const readline = require('readline')

var input = readline.createInterface({
	input: process.stdin,
	output: process.stdout
})

function nextPerfectSquare(n) {
	var nextN = Math.floor(Math.sqrt(n)) + 1;
	return (nextN * nextN)
}

input.on('line', (line) => {
	console.log(line);
})