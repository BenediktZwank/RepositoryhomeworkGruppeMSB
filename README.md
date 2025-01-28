Mike Wallitzek 7411737
Sharon Prabakaran 7411766
Benedikt Zwank 7407699

# Grading

| Sheet       | Ex. 1    | Ex. 2    | Ex. 3    | Ex. 4    | Ex. 5    | Sum      |
| ----------- | -------- | -------- | -------- | -------- | -------- | -------- |
| Homework 01 | 4/4      | 5/6      | 2.25/5   | 3.75/5   | -        | 15/20    |
| Homework 02 | 3.25/4.5 | 4/4.5    | 5.25/6   | 5/5      | -        | 17.5/20  |
| Homework 03 | 6/8      | 5.25/5.5 | 5.25/6.5 | -        | -        | 16.5/20  |
| Homework 04 | 4.25/5   | 4.75/5   | 3.75/7   | 2.5/3    | -        | 15.25/20 |
| Homework 05 | 5/5      | 5.25/7   | 4/8      | -        | -        | 14.25/20 |
| Homework 06 | 6.5/8    | 7/8      | 4/4      | -        | -        | 17.5/20  |
| Homework 07 | 4/4      | 3.75/4   | 8/8      | 2/4      | -        | 17.75/20 |
| Homework 08 | -        | -        | -        | -        | -        | Skipped  |
| Homework 09 | 4/4      | 8/8      | 7/8      | -        | -        | 19/20    |

### Erläuterungen zur Bewertung

HW09:
- Ex. 3: Test-Coverage-Datei ist nicht als Artefakt in Pipeline verfügbar \[-1p\].

HW07:
- Ex. 2 a): Java ist case-sensitive und JPA erwartet hier eine `@Id`-Annotation, nicht `@ID` \[-0.25p\].
- Ex. 4: Screenshots von den Anfragen an die anderen beiden Endpoints fehlen \[-2p\].

HW06:
- Ex. 1: Die Methode checkGroupCapacities() müsste auf einem ExerciseGroupManager-Objekt und nicht, wie in Zeile 16 initialisiert, einem ExerciseGroupManagerTest-Objekt aufgerufen werden \[-0.25p\]. Typo im Methodennamen checkGroupCapacities() \[-0.25p\]. Die Testfälle 8 und 9 aus HW05 Ex. 2 wurden nicht mit den Eingabeparametern getestet, die ihr in eurer Tabelle angegeben hattet \[-1p\].
- Ex. 2 a): Fehlende Mocks für die Student-Objekte und die darauf in generateStudentDistribution() aufgerufenen Methoden \[-1p\].

HW04, HW05: Siehe Bemerkungen im Ordner *Correction Files*.

HW03:
- Ex. 1 a): Siehe Bemerkungen im Ordner *Correction Files*.
- Ex. 1 b): Die ganzen Associations wurden nicht umgesetzt \[-0.75p\]. Die Methoden register() und manageCourses() hätte man durchaus umsetzen können, indem das als Eingabeparameter angenommene Course-Objekt in eine entsprechende Liste hinzugefügt wird, die die jeweiligen Kurse verwaltet \[-0.5p\].
- Ex. 2: Achtung: Das Kriterium, nach dem die Liste entities durchsucht werden soll, muss nicht eindeutig sein. In dem Fall gibt findEntityByCriterion() aktuell aber nur das erste gefundene Objekt zurück \[-0.25p\].
- Ex. 3: Das Objekt, auf dem die Methode checkGroupCapacaties() aufgerufen wird, sollte von der Klasse ExerciseGroupManager und nicht ExerciseGroupManagerTest sein \[-0.25p\]. Dieses besser in einer @BeforeEach-Methode initialisieren. Der letzte Test ist falsch - in dem Fall wird eine Exception geworfen \[-1p\].

HW02:
- Ex. 1: "Lane 3" richtig benennen. Fehlende Beschriftung der Branches (Boolean Expressions an Pfeilen). Der Adjustment-Branch müsste nicht zu "Enter Times" sondern noch etwas früher nämlich vor den Fork wieder zurückführen. Dort sollte dann auch der fehlende Merge-Knoten vom Branching hin. Spielt euer Diagramm mal so wie in VL 5 mit dem wandernden blauen Punkt durch, um zu sehen, was passiert, wenn ihr einen Quereinstieg in den Fork macht, und beachtet dabei die unterste Regel auf Folie 21.
- Ex. 2: Unbeschriftetes Event zwischen "Not Assigned" und "Assigned". Transition von "Not Enrolled" zum Final State (bzw. "Terminated") durch das Event "Course closed" fehlt. Die Transition von "In Conflict" zu "Assigned" durch das Event "Resolve Conflict" war nicht explizit gegeben, kann man aber implizit annehmen. "Terminated" als eigenen State mit rein zu nehmen ist okay, aber unnötig - stattdessen kann man die Pfeile auch direkt zum Bull's Eye führen, was das Gleiche bedeutet.
- Ex. 3: Das Frontend als Component und die damit verbundenen Interfaces fehlen. Die Ports und Delegates, mit denen die Subcomponents Course Management und Communication im View Component verbunden sein sollten, fehlen.

HW01:
- Ex. 2: Eure Functional Requirements 1 und 2 gehören zusammen. Im Text sind es die Lehrpersonen, die die Gruppen einrichten und dabei gewisse Details festlegen. Die beiden angegebenen Process Requirements sind eigentlich Project Requirements.
- Ex. 3: Bei Functional Requirement 1 könnte man noch konkretisieren, welche Angaben bei der Gruppenerstellung gemacht werden müssen. Dass die beiden ersten Requirements sich irgendwie überschneiden, hätte beim Consistency-Check auffallen können. Functional Requirement 3 ist ziemlich unpräzise. Konkretisiert z.B. wer sich einloggt, mit welchen Zugangsdaten (bereits von anderen Tools existierende oder neue) usw. Bei Functional Requirement 5 könnte präzisiert werden, wie das funktionieren soll: geben die Studierenden allgemein einfach alle Zeiten in der Woche an, an denen sie nicht können, oder wählen sie aus den Übungsterminen diejenigen aus, die ihnen nicht passen? Bei Functional Requirement 6 fehlt ein Verbesserungsvorschlag. "Tausende von Studenten" ist etwas unkonkret bei Quality Requirement 1. Wie kann das Usability Requirement verbessert werden? Bzgl. der Testversion kann man sich fragen, welche Funktionalität darin schon enthalten sein soll. Generell fehlen an vielen Stellen Begründungen für eure Entscheidungen, was ja explizit Teil der Aufgabenstellung war.
- Ex. 4: "ranks her preferences" aus Szenario 1 fehlt. Aufforderung, den Konflikt mit dem Kurskoordinator zu klären, aus Szenario 2 fehlt. Eigene Annahmen sollten als solche markiert werden. Der Trigger ergibt keinen Sinn (doppelt sich mit Schritt 4). Die Details bzgl. der E-Mail aus Szenario 3 fehlen.
