Background
If your phone buttons have letters, then it is easy remember long phone numbers by making words from the substituted digits.

![alt text](https://i.imgur.com/VJU55cg.png "Phone Keypad")

https://en.wikipedia.org/wiki/Phoneword

source: imgur.com

This is common for 1-800 numbers

1-800 number format
This format probably varies for different countries, but for the purpose of this Kata here are my rules:

A 1-800 number is an 11 digit phone number which starts with a 1-800 prefix.

The remaining 7 digits can be written as a combination of 3 or 4 letter words. e.g.

1-800-CODE-WAR
1-800-NEW-KATA
1-800-GOOD-JOB
The - are included just to improve the readibility.

Story
A local company has decided they want to reserve a 1-800 number to help with advertising.

They have already chosen what words they want to use, but they are worried that maybe that same phone number could spell out other words as well. Maybe bad words. Maybe embarrassing words.

They need somebody to check for them so they can avoid any accidental PR scandals!

That's where you come in...

Kata Task
Preloaded.WORDS is a preloaded array of lots of 3 and 4 letter (upper-case) "words"

Given the 1-800 (phone word) number that the company wants to use, you need to check against all known words and return the set of all possible 1-800 numbers which can be formed using those same digits.

Notes
The desired phone-word number provided by the company is formatted properly. No need to check.
All the letters are upper-case. No need to check.
Only words in the list are allowed.