Mike Wallitzek 7411737
Sharon Prabakaran 7411766
Benedikt Zwank 7407699

# Grading

| Sheet       | Ex. 1    | Ex. 2    | Ex. 3    | Ex. 4    | Ex. 5    | Sum      |
| ----------- | -------- | -------- | -------- | -------- | -------- | -------- |
| Homework 01 | 4/4      | 5/6      | 2.25/5   | 3.75/5   | -        | 15/20    |
| Homework 02 | 3.25/4.5 | 4/4.5    | 5.25/6   | 5/5      | -        | 17.5/20  |

### Erläuterungen zur Bewertung

HW02:
- Ex. 1: "Lane 3" richtig benennen. Fehlende Beschriftung der Branches (Boolean Expressions an Pfeilen). Der Adjustment-Branch müsste nicht zu "Enter Times" sondern noch etwas früher nämlich vor den Fork wieder zurückführen. Dort sollte dann auch der fehlende Merge-Knoten vom Branching hin. Spielt euer Diagramm mal so wie in VL 5 mit dem wandernden blauen Punkt durch, um zu sehen, was passiert, wenn ihr einen Quereinstieg in den Fork macht, und beachtet dabei die unterste Regel auf Folie 21.
- Ex. 2: Unbeschriftetes Event zwischen "Not Assigned" und "Assigned". Transition von "Not Enrolled" zum Final State (bzw. "Terminated") durch das Event "Course closed" fehlt. Die Transition von "In Conflict" zu "Assigned" durch das Event "Resolve Conflict" war nicht explizit gegeben, kann man aber implizit annehmen. "Terminated" als eigenen State mit rein zu nehmen ist okay, aber unnötig - stattdessen kann man die Pfeile auch direkt zum Bull's Eye führen, was das Gleiche bedeutet.
- Ex. 3: Das Frontend als Component und die damit verbundenen Interfaces fehlen. Die Ports und Delegates, mit denen die Subcomponents Course Management und Communication im View Component verbunden sein sollten, fehlen.

HW01:
- Ex. 2: Eure Functional Requirements 1 und 2 gehören zusammen. Im Text sind es die Lehrpersonen, die die Gruppen einrichten und dabei gewisse Details festlegen. Die beiden angegebenen Process Requirements sind eigentlich Project Requirements.
- Ex. 3: Bei Functional Requirement 1 könnte man noch konkretisieren, welche Angaben bei der Gruppenerstellung gemacht werden müssen. Dass die beiden ersten Requirements sich irgendwie überschneiden, hätte beim Consistency-Check auffallen können. Functional Requirement 3 ist ziemlich unpräzise. Konkretisiert z.B. wer sich einloggt, mit welchen Zugangsdaten (bereits von anderen Tools existierende oder neue) usw. Bei Functional Requirement 5 könnte präzisiert werden, wie das funktionieren soll: geben die Studierenden allgemein einfach alle Zeiten in der Woche an, an denen sie nicht können, oder wählen sie aus den Übungsterminen diejenigen aus, die ihnen nicht passen? Bei Functional Requirement 6 fehlt ein Verbesserungsvorschlag. "Tausende von Studenten" ist etwas unkonkret bei Quality Requirement 1. Wie kann das Usability Requirement verbessert werden? Bzgl. der Testversion kann man sich fragen, welche Funktionalität darin schon enthalten sein soll. Generell fehlen an vielen Stellen Begründungen für eure Entscheidungen, was ja explizit Teil der Aufgabenstellung war.
- Ex. 4: "ranks her preferences" aus Szenario 1 fehlt. Aufforderung, den Konflikt mit dem Kurskoordinator zu klären, aus Szenario 2 fehlt. Eigene Annahmen sollten als solche markiert werden. Der Trigger ergibt keinen Sinn (doppelt sich mit Schritt 4). Die Details bzgl. der E-Mail aus Szenario 3 fehlen.
