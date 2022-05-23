
# Rapport

(Detta kommer ändras senare)

Krav:

* Appen skall ha en huvudskärm med en lista (RecyclerView) med er JSON-data
* Appen skall hämta och presentera JSON-data från kursens webbtjänst: https://mobprog.webug.se/json-api?login=brom (byt ut brom mot ditt eget login) (Ni skapar och lägger in er apps JSON-data hos kursens webbtjänsten via admin-gränssnittet OBS! den data ni använder får inte innehålla copyright-information.)
* Appens JSON-data är en JSON-array med JSON-objekt. Dessa JSON-objekt måste som minst innehålla attributen ID,Login och 3 ytterligare attribut (totalt minst 5 attribut).
* JSON-arrayen måste som minst innehålla 5 JSON-objekt. Det vill säga minst 5 stycken olika rader med exempel-data måste finnas lagrad i er webbtjänst. T ex, i FamousPeakJSON-tjänsten så är varje berg en rad.
* JSON data hämtas med hjälp av klassen JsonTask som ni kopierar från https://raw.githubusercontent.com/LenaSYS/mobileapp-programming-networking/master/app/src/main/java/com/example/networking/JsonTask.java
* Er JSON-data skall presenteras med hjälp av en RecyclerView som får sin data via en adapter - så som ni gjort i tidigare inlämningsuppgifter
* Appen skall ha en separat "about"-skärm som beskriver appens målgrupp. About-skärm skall vara en egen aktivitet. (Till exempel kan "about"-skärm presenteras i en webview med internal web page.)
* Inkludera även lite skärmdumpar/video från appen, i fall det strular med demo vid presentationen. Denna presentation ger ni vid slutseminariumet.