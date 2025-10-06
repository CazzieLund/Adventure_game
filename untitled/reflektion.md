# Reflektioner
När jag började med spelet kändes det ganska rörigt med alla olika krav, 
men när jag väl fick igång grunden med klasserna började det flyta på. 
Jag började med Character som abstract, och därifrån fick både Hero och 
Monster ärva. Senare kunde jag bygga på med Goblins och Bossar. 
Det var först lite krångligt att förstå hur abstrakta metoder skulle 
fungera, men jag insåg att det var ett smidigt sätt att tvinga alla monster 
att ha t.ex. encounter() och attack(). Det gjorde spelet mer konsekvent.

En sak som gick bra var att dela upp projektet i olika packages, typ model, 
ui, app och util. Det gjorde det mycket enklare att hitta i koden. Jag 
tycker också att menyerna blev bra, och det var kul när jag fick loopen 
att köra spelet framåt med spelarens val. Att använda Scanner för input 
var simpelt men fungerade bra.

Något som var svårt var att balansera striderna. Hjälten började med 100 
HP och gjorde bara 10 i damage, så om monstren var för starka gick det 
inte att vinna. Jag fick prova mig fram med HP, damage och XP-rewards 
för att få det att kännas lagom. En annan grej som tog lite tid var att 
få fight-loopen att funka utan att fastna, men efter att jag lagt in 
små delays och ordnade med villkoren så blev det ganska bra.

Jag har lärt mig mycket om inkapsling. Jag förstod inte riktigt i början
varför man inte bara kan ha allt som public, men nu fattar jag att det 
blir mer kontrollerat och säkrare med getters och setters. Jag tycker 
också att jag börjar få kläm på polymorfism, det var häftigt att jag 
kunde skicka in vilken typ av monster som helst i fight() och det bara 
fungerade.

Sammanfattningsvis tycker jag projektet var lärorikt och jag är nöjd 
med att jag fick ihop ett spel som faktiskt går att spela. Jag tycker dock att 
vi fått lite för lite tid för denna uppgift. Hade önskat längre tid eller
simplare uppgift. Hade jag haft lite mer tid hade jag skapat en shop. 
Jag började kika på det men insåg att jag tyvärr inte hade tid för det denna gång.
