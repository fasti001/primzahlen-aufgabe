## Aufgabe 5

> Überlegen Sie sich, wie das Programm erweitert werden muss, damit das
Streichen des Vielfachen von i in einem eigenen Thread abläuft.

Im äußeren Loop Threads spawnen, duh.

> Welche Veränderungen müssen in diesem Fall an dem Programm vorgenommen werden?

Man muss ein Ready-Array führen, weil sonst die Reihenfolge nicht mehr gewährleistet werden kann.

> Ist es sinnvoll, diese Erweiterung durchzuführen?

Kontext? 

Wenn du eh 1 Sekunde wartest, macht es null Sinn.

Dann gibst du die Aufgabe an Thread 2 und wartest bis er fertig ist. 

=> Es läuft de-facto wieder synchron, aber mit zusätzlichem Overhead wegen Thread-Spawning