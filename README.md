# Contact-List
A few days ago, Lea experienced one of the horrors of modern life: She dropped her
smartphone. Now, her screen is cracked and sometimes random locations on the screen
act as if they had just been pressed. When sending a message to one of her contacts, she
enters the name of the contact into a searchbox. If the name matches exactly, she can
send the message with just another click. However, now that her screen is cracked, this
means that sometimes her phone already sends the message to "Bob", while Lea meant
for it to be sent to "Bobby", which are totally different people. This has embarassed Lea
quite a few times now, so she wants to rename some of her contacts such that no contact
is a prefix of another one. Can you tell her how many contacts she has to rename?
<br />
#Input
The first line of the input contains an integer t. t test cases follow, each of them separated
by a blank line. <br /> <br />
Each test case consists of an integer n, the amount of contacts Lea has in her phone. n
lines follow, each line containing the name of a contact (where the first letter is in "A" to
"Z" and the rest is in "a" to "z").

#Output
For each test case, output one line containing \Case #i: x"where i is its number, starting
at 1, and x is the minimal amount of contacts Lea has to rename. Each line of the output
should end with a line break.

#Constraints
1 <= t <= 20 <br />
1 <= n <= 10000 <br />
Contact names are unique. <br />
Contact names are not longer than 500 characters. <br />

#Sample Data
Input <br />
1 <br />
7 <br />
Bob <br />
Bobby <br />
Boba <br />
Charles <br />
Charly <br />
Julia <br />
Julian <br />
<br />
Output <br />
Case #1: 2 <br />
