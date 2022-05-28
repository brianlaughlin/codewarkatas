function narcissistic(value) {
  let sum = 0;
  let eachDigit = value.toString().split('');
  for (let i = 0; i < eachDigit.length; i++) {
    sum += Math.pow(eachDigit[i], eachDigit.length);
  }
  return sum === value;


  function narcissisticBestPractice(value) {
    return ('' + value).split('').reduce(function (p, c) {
      return p + Math.pow(c, ('' + value).length)
    }, 0) === value;
  }

}