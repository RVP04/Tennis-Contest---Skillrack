# Tennis-Contest
<br> <p>A Tennis contest was scheduled in a college. N number of players registered to participate in&nbsp;this contest. (A player is the winner if he wins in all the rounds of the contest. Every round has elimination. Thus, one-half of the players are eliminated in each round. For example, If P number of players were in a specific round, then P/2 players win and move to the next round). The number of players N and the players details (ID and Name) are given as input. The program should print the names of the players who were defeated by the winner of the contest from final round to the first round.</p>

<p>Note : Total number of players N will always be a power of 2 and N &gt;= 2.</p>

<p><strong>Input/Output Format:<br>
Input:</strong><br>
The first line contains N.<br>
The next N lines contain&nbsp;the player's ID and name separated by a space.<br>
The remaining lines contain the match details in the format<strong> WinnerIDvsRunnerID.</strong></p>

<p><strong>Output:</strong><br>
Print the names of the players who were defeated by the winner from final round to the first round.</p>

<p><strong>Example Input/Output 1:<br>
Input:</strong><br>
4<br>
101 Ram<br>
102 Sri<br>
103 Sheik<br>
104 Vel<br>
101vs102<br>
103vs104<br>
101vs103</p>

<p><strong>Output:</strong><br>
Sheik<br>
Sri</p>
