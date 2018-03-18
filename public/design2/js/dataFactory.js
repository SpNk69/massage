var gg = angular.module('myTestApp2', []); //ngMessages

gg.factory('myDataFactory', function () {

    return {
        getInaHurryData: function () {
            return {
                "lt": {
                    "title": "Skubate?",
                    "sentence": "Visiems skubanties, neturintiems laiko ar tiesiog nenorintiems daugiau informacijos, spauskite žemiau esantį mygtuką ir rezervuokite laiką jau dabar!",
                    "button": "Rezervuoti laiką dabar!"
                },
                "de": {
                    "title": "In Eile?",
                    "sentence": "Für alle Eiligen, die keine Zeit haben oder einfach keine Informationen mehr haben wollen, klicken Sie auf den Button unten und reservieren Sie jetzt Zeit!\n",
                    "button": "Buchen Sie jetzt!\n"
                },
                "ru": {
                    "title": "В спешке?",
                    "sentence": "Для всех спешащих людей, у которых нет времени или просто не нужно больше информации, нажмите кнопку ниже и зарезервируйте время прямо сейчас!\n",
                    "button": "Забронируйте сейчас!\n"


                }
            }
        },

        getPageTitle: function () {
            return {
                "lt": {
                    "title": "Grįžti į pradžią"
                },
                "de": {
                    "title": "Gehe zurück nach oben"
                },
                "ru": {
                    "title": "Вернуться в начало"
                }
            }

        },
        getIntroData: function () {
            return {
                "lt": {
                    "intro": "Masažas yra vienas iš ypatingų veiksnių žmogaus gyvenime, padedančių palaikyti puikią kūno ir dvasios būseną. Ir nieko nėra geresnio, kaip po sunkios ir išvargintos darbo dienos atsipalaiduoti ir atgaivinti savo kūną masažo procedūromis.",
                    "findMore": "Sužinokite daugiau",
                    "bookNow":"Rezervuokite laiką"

                },
                "de": {
                    "intro": "Massage ist eine der besonderen Faktoren in das Leben einer Person, zu helfen einen guten Körper und Seele zu halten. Und es gibt nichts Besseres als nach einem harten und müden Arbeitstag, entspannen und beleben Sie Ihren Körper mit Massage–Verfahren.",
                    "findMore": "Erfahren Sie mehr",
                    "bookNow":"Sparen Sie Zeit"


                },
                "ru": {
                    "intro": "Массаж является одним из особых факторов в жизни человека, помогая поддерживать хорошее тело и душу. И нет ничего лучше, чем после тяжелого и усталого рабочего дня, расслабиться и оживить cвое тело массажными процедурами.",
                    "findMore": "Узнайте больше",
                    "bookNow":"резервировать время"

                }
            }

        },
        getNavBarData: function () {
            return {

                "lt": {
                    "about": "Apie",
                    "massages": "Masažai",
                    "gallery": "Galerija",
                    "prices": "Kainos",
                    "book": "Užsakyti",
                    "contacts": "Kontaktai",
                },
                "de": {
                    "about": "Über",
                    "massages": "Massagen",
                    "gallery": "Galerie",
                    "prices": "Preise",
                    "book": "Bestellen",
                    "contacts": "Kontakte",
                },
                "ru": {
                    "about": "Oбо",
                    "massages": "Mассажы",
                    "gallery": "Галерея",
                    "prices": "Цена",
                    "book": "Заказать",
                    "contacts": "Kонтакты",
                }
            };
        },

        getAboutMeTitle: function () {
            return {
                "lt": {
                    "whoIAm": "Kas aš?",
                    "exp": "Išsilavinimas",
                    "workExp": "Darbo patirtis",
                    "spa": "Spa sertifikatai",
                    "title": "Jūsų paslaugoms"
                },
                "de": {
                    "whoIAm": "Wer bin Ich?",
                    "exp": "Bildung",
                    "workExp": "Berufserfahrung",
                    "spa": "Spa–Zertifikate",
                    "title": "Zu Ihren Diensten"
                },
                "ru": {
                    "whoIAm": "Kто я?",
                    "exp": "Oбразование",
                    "workExp": "Oпыт работы",
                    "spa": "Спа–сертификаты",
                    "title": "К вашим услугам"
                }
            }
        },

        getAboutMeBody: function () {
            return {
                "lt": {
                    "whoIAm": ["Mano vardas Vida. Atvykau iš Lietuvos. Gyvenu Šveicarijoje, Schaffhausen mieste.", "Man masažai – tai iššūkis ir malonumas.", "Iššūkis – panaikinti skausmus žmogaus kūne.", "Malonumas – kai nebelieka skausmų, dingsta įtampa, sugražinama gera savijauta, o žmogaus veide atsiranda šypsena.", "Mano tikslas yra padėti žmonėms jaustis puikiai, bet kuriuo amžiaus periodu."],
                    "exp": ["Vilniaus aukštesnioji medicinos mokykla, Lietuva.", "Klaipėdos universitetas. Bakalauro laipsnis Visuomenės sveikata.", "2010 metai – Baltic SPA Professional Kursai (Latvija), SPA masažai.", "2012 metai – Slaugos darbuotojų tobulinimosi ir specializacijos centras: Pažymėjimas Nr. KV 120146 – suteikta teisė daryti gydomuosius masažus."],
                    "workExp": ["27 metai: Medicinos sesuo.", "8 metai: Visuomenės sveikatos priežiūros specialistė.", "7 metai: Masažuotoja."],
                    "spa": ["Klasikinis segmentinis masažas", "Karštų–šaltų akmenų masažas", "Limfodrenažinis masažas", "Thai pėdų masažas", "Tradicinis ajurvedinis Keralos masažas\n"]
                },
                "de": {
                    "whoIAm": ["Meine Name ist Vida. Ich komme aus Litauen. Ich wohne jetzt in der Schweiz, in der Stadt Schaffhausen.", "Für mich ist Massage eine Herausforderung und Vergnügen.", "Die Herausforderung – beseitigen Schmerzen im menschlichen Körper.", "Vergnügen – es mehr keinen Schmerz, verschwindet die Spannung, kommt die gut Gesundheit zurück, und ein Lächeln erscheint auf dem Gesicht der Person.", "Mein Ziel – den Leuten zu helfen, sich in jedem Alter gut zu fühlen."],
                    "exp": ["Vilnius Höhere Medizinische Fakultät Litauen.", "Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen.", "2010 – \"Baltic SPA Profi\" Kurse (Lettland), Wellness–Massagen.", "2012 – Zentrum für Entwicklung und Spezialisierung des Pflegepersonals: Zertifikat Nr. 120146 KV – das Recht hat therapeutische Massage zu machen."],
                    "workExp": ["27 Jahre: Krankenschwester.", "8 Jahre: Gesundheitswesen Specialist.", "7 Jahre: Masseurin."],
                    "spa": ["Klassische Segmentmassage", "Hot Stone Massage", "Manuelle Lymphdrainage", "Thai–Fußmassage", "Traditional Kerala Ayurveda–Massage"]
                },
                "ru": {
                    "whoIAm": ["Меня зовут Вида. Я приехала из Литвы. Теперь живу в Швейцарии, в городе Шаффхаузен.", "Для меня массаж – это вызов и удовольствие.", "Вызов – устранить боль в теле человека.", "Удовольствие – когда нет больше боли, напряжение исчезает, возвращается хорошое самочувствие, а на лице человека появляется улыбка.", "Моя цель – помочь людям чувствовать себя прекрасно в любом возрасте."],
                    "exp": ["Вильнюсская высшая медицинская школа. Литва.", "Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва.", "2010 г. – \"Baltic SPA Professional\" курсы (Латвия), спа–массажы.", "2012 г. – Центр развития и специализации медсестринского персонала: Сертификат Нет. KV 120146 – предоставляется право делать терапевтические (лечебные) массажы."],
                    "workExp": ["27 лет: медицинская сестра.", "8 лет: специалист общественного здравоохранения.", "7 лет: массажист."],
                    "spa": ["Классический сегментный массаж", "Массаж горячими – холодными камнями", "Лимфодренажный массаж", "Тайский массаж стоп", "Традиционный аюрведический Керал массаж"]
                }
            }
        },
        getMassagesTitles: function () {
            return {
                "lt": {
                    "limphoBody": "Limfodrenažinis kūno masažas",
                    "limphoFace": "Limfodrenažinis veido masažas",
                    "stoneHotCold": "Karštų–šaltų akmenų masažas",
                    "backSpin": "Klasikinis – segmentinis nugaros masažas",
                    "older": "Masažas vyresnio amžiaus žmonėms",
                    "relaxBody": "Atpalaiduojantis viso kūno masažas",
                    "ajurved": "Ajurvedinis krūtų masažas moterims",
                    "antice": "Anticeliulitinis masažas rankomis",
                    "relaxFoot": "Atpalaiduojantis pėdų – blauzdų masažas",
                    "sepHead": "Galvos masažas",
                    "sepNeck": "Pečių – kaklo – rankų masažas",
                    "sepStoma": "Pilvo masažas",
                    "sepWaist": "Juosmens – sėdmenų – kojų masažas"
                },
                "de": {
                    "limphoBody": "Manuelle Lymphdrainage",
                    "limphoFace": "Manuelle Lymphdrainage Gesicht",
                    "stoneHotCold": "Heiß – kalt Steinmassage",
                    "backSpin": "Rücken Massage",
                    "older": "Massage für ältere Menscher",
                    "relaxBody": "Entspannende Ganzkörpermassagе",
                    "ajurved": "Ayurvedische Brüstmassage für Frauen",
                    "antice": "Anti – Cellulite massage",
                    "relaxFoot": "Entspannende Füße – Waden massage",
                    "sepHead": "Kopfmassage",
                    "sepNeck": "Massage Schulter – Hals – Hände",
                    "sepStoma": "Bauchmassage",
                    "sepWaist": "Lendenwirbel – Gesäß – Beinmassage"
                },
                "ru": {
                    "limphoBody": "Лимфодренажный массаж тела",
                    "limphoFace": "Лимфодренажный массаж лица",
                    "stoneHotCold": "Горячих – холодных камней массаж",
                    "backSpin": "Классический – Сегментный массаж спины",
                    "older": "Массаж для пожилых людей",
                    "relaxBody": "Расслабляющий массаж всего тела",
                    "ajurved": "Аюрведический массаж грудей",
                    "antice": "Антицеллюлитный массаж",
                    "relaxFoot": "Расслабляющий массаж стоп–голень",
                    "sepHead": "Массаж головы",
                    "sepNeck": "Плечо – шеи – рук массаж",
                    "sepStoma": "Абдоминальный массаж",
                    "sepWaist": "Поясницы – Ягодицы – Ног Массаж"
                }
            };
        },
        getMassageBodyData: function () {
            return {
                "lt": {
                    "limphoBody": "Tai saugus efektyvus būdas sustiprinti sveikatą bei palaikyti gerą savijautą. Sveikiems žmonėms – tai profilaktinė priemonė, palaikanti normalią medžiagų apykaitą.\n" +
                    "Masažo metu suaktyvinami pažeistų minkštųjų audinių regeneracijos procesai, slopinami uždegiminiai procesai, sustiprinamas imunitetas, pagerinamas audinių aprūpinimas deguonimi.\n" +
                    "Limfodrenažinis masažas tinka visiems, kurie jaučia kojų pabrinkimą, patinimą ar tiesiog nuovargį. Po ilgos dienos jis puikiai atpalaiduoja pavargusias kojas ir suteikia lengvumo pojūtį. Taip pat tinka žmonėms, kurių kojos visada šaltos.\n" +
                    "Šis masažas grožio tikslais naudojamas celiulito gydymui ir profilaktikai, odos stangrinimui, apimčių mažinimui, bendrai savijautai gerinti ir mažinti patinimus po plastinių operacijų.\n" +
                    "Šis masažas atliekamas moterims ir vyrams. Gydymui ši procedūra skiriama kasdien, profilaktiškai – 2–3 kartus per savaitę. Norimas efektas pasiekiamas po 15 procedūrų.",
                    "limphoFace": "Esant nuolatiniam stresui ir nuovargiui, veido raumenys sustingsta ,,liūdesio\" kaukėje. Sunkėja limfos nutekėjimas, o kartu toksinių medžiagų apykaitos produktų šalinimas.\n" +
                    "Veido limfodrenažas suteikia puikių rezultatų:\n" +
                    "veido pabrinimais,\n" +
                    "išsausėjusia oda,\n" +
                    "ankstyvuoju senejimu,\n" +
                    "tamsiais ratilais ir maišeliais po akimis,\n" +
                    "sumažėjusiu audinių bei raumenų elastingumu,\n" +
                    "kovojant su kuperoze.\n" +
                    "Sumažinę veido suglebimą, sulaukiame ryškaus standinamojo efekto, išsilygina raukšlės.",
                    "stoneHotCold": "Akmenys turi savybę iš raumenų pašalinti toksines medžiagas, susikaupusias dėl streso ir nesveiko gyvenimo būdo, gerina miegą, padeda sureguliuoti kraujospūdį, teigiamai veikia širdies ritmą, sužadinamos natūralios organizmo galios, padedančios įveikti ligas, paspartinamas gijimo procesas. Ši terapija veikia daugelį organizmo grandžių:\n" +
                    "Stimuliuoja imuninę sistemą;\n" +
                    "Suaktyvina kraujotaką;\n" +
                    "Pagerėja aprūpinimas deguonimi;\n" +
                    "Lengvai ir maloniai numalšina raumenų, nugaros, galvos ir kaklo skausmus;\n" +
                    "Teigiamai veikia nervinę sistemą;\n" +
                    "Gerindama metabolizmą, padeda atsikratyti riebalų pertekliaus.\n" +
                    "Šis masažas ypač tinka pervargus, patyrus gilų stresą, jaučiant nervingumą, apatiją, miego sutrikimus.",
                    "backSpin": "Šis masažas idealiai tinka žmonėms, kurie visą dieną praleidžia stovėdami, sėdėdami pavyzdžiui: prie kompiuterio arba vairuodami automobilį taip pat dirbantiems sėdimą ar sunkų fizinį darbą, kai visa įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi raumenų mazgai. Šis masažas ypač tinka po treniruočių kai būna ilgalaikis ir trumpalaikis skausmas. Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą. \n" +
                    "Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros ir galvos skausmų, atpalaiduoti įtemptas raumenų grupes. \n" +
                    "Po masažo atslūgsta nugaros, galvos, pečių, sėdmenų skausmai. \n" +
                    "Po masažo Jūs jausitės pailsėję ir energingi.",
                    "older": "Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką, pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė. \n" +
                    "Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.",
                    "relaxBody": "Atpalaiduojantis masažas tinka visiems, norintiems atsipalaiduoti po sunkios dienos, užsimiršti bei pabėgti nuo kasdienės rutinos. Pašalina įtampą ir stresą, atslūgsta nugaros ir galvos skausmai, atsipalaiduoja raumenys, teigiamai veikia vidinę organizmo būseną, pagerina nuotaiką bei grąžina energiją.",
                    "ajurved": "Yra skirtas krūtinės sričiai. Jis atliekamas ne tik norint pagražinti krūtinę, sustangrinti krūtis, suteikti joms gražią formą, bet ir siekiant gilesnių terapinių tikslų. Šis masažas daro teigiamą įtaką visų moters reprodukcinių organų sistemai bei padeda subalansuoti hormonų sistemos veiklą. Labai sumažina nemalonų krūtų jautrumą, susijusį su menstruacijų ciklu. Praktiškai išnyksta krūtų vėžio rizika. Švelnėja implantų surandėjimai.\n" +
                    "Toks masažas pagerina savijautą, padaro krūtis gražesnes, suteikia pasitikėjimo ir padeda geriau jaustis kaip moteriai.",
                    "antice": "Tai ypač efektyvus kovos su celiulitu būdas, taikomas tam tikrų probleminių sričių – šlaunų, sėdmenų ir pilvo – netolygiam poodiniam sluksniui (celiulitui) mažinti. \n" +
                    "Masažas aktyvina limfotaką, padidina raumenų susitraukimą ir tonusą dėl to, mažėja celiulitas ir patinimai. Išvalo organizmą nuo šlakų bei suteikia ryškiai išreikštą kosmetinį efektą. \n" +
                    "Masažas su Tibeto moline taure yra pats švelniausias – nepalieka mėlynių, nežaloja kapiliarų.\n" +
                    "Naudojant Tibeto molinę vakuuminę taurę.",
                    "relaxFoot": "Taikomas pavargusioms, skausmingoms pėdoms ir blauzdoms atpalaiduoti, kūno gyvybiniam tonusui padidinti, imunitetui stiprinti. Ši procedūra tinka daug vaikštantiems, dirbantiems stovimą arba žmonėms šąlančiomis kojomis. Pėdų, blauzdų masažas padeda atsigauti ir pailsėti visam organizmui.",

                    "sepHead": "Sumažina stresą, galvos skausmus, gerina kraujo apytaką.",
                    "sepNeck": "Efektyviausia nemalonių simptomų šalinimo priemonė. Jau po pirmo karto jus pajusite bendrą savijautos pagerėjimą. Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Tai yra puiki priemonė atsikratyti galvos, kaklo, pečių skausmo, rankų tirpimo jausmo.",
                    "sepStoma": "Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne",
                    "sepWaist": "Gerina kraujo ir limfos apytaką juosmens bei kojų srityse, atpalaiduoja įsitempusius raumenis, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis. Sumažina skausmą po operacijos, mažina nervinių šaknų uždegimą."


                },
                "de": {
                    "limphoBody": "Es ist eine sichere effektive Möglichkeit, die Gesundheit zu fördern und zu pflegen Wohlbefinden . Bei gesunden Menschen – es ist eine vorbeugende Maßnahme normalen Stoffwechsel aufrecht zu erhalten. Während der Massage aktiviert die Regeneration geschädigter Weichgewebe, entzündliche Prozesse zu verlangsamen, stärkt das Immunsystem, verbessert die Sauerstoffversorgung der Gewebe. Dies hilft, überschüssige Flüssigkeit aus dem Gewebe und Organe zu beseitigen.\n" +
                    "Lymphdrainage ist geeignet für diejenigen, die die Schwellung der Beine fühlen, Schwellungen oder einfach Müdigkeit. Nach einem langen Tag, er entspannt müde Beine und gibt ein Gefühl von Leichtigkeit. Es eignet sich auch für Menschen, deren Füße sind immer kalt.\n" +
                    "Diese Massage ist für Frauen und Männer.\n" +
                    "Für die Behandlung – empfiehlt jeden Tag, für die Prävention – 2–3 mal pro Woche.\n" +
                    "Der gewünschte Effekt wird nach 15 Prozeduren erreicht.",
                    "limphoFace": "NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????NERA TEKSTO????",
                    "stoneHotCold": "Die Steine, die bei dieser Massage eingesetzt werden, wurden an der Küste der Ostsee gesammelt. Über Tausende von Jahren waren sie den Kräften des Meeres ausgesetzt, wurden von Sonne, Luft und Winden geformt und erhielten so ihre einzigarten Formen und Eigenschaften, die den menschlichen Körper positiv beeinflussen.\n" +
                    "Die Steine haben die Fähigkeit, Giftstoffe und angestauten Stress abzubauen sowie Anspannungen zu lösen. Sie verbessern den Schlaf, unterstützen den Blutdruck und ihre Energie wirkt sich positiv aufs Herz aus und reguliert so die körpereigenen, natürlichen Kräfte.\n" +
                    "Diese Massage eignet sich deshalb besonders gegen Müdigkeit und Stress, da die Wärme der Steine muskelentspannend wirken. Die Abwechslung mit den kühlen Steinen wirkt sich dabei vitalisierend auf das vegetative Nervensystem aus und entspannt zudem verkrampfte Rücken–, Kopf– und Nackenmuskulatur.\n" +
                    "Bei Schwangerschaft, Infektions– und Krebskrankheiten wird diese Massage nicht empfohlen.",
                    "backSpin": "Die Rücken Massage ist eine gelungene Synthese der unterschiedlichsten Techniken aus Ost und West mit dem einen Ziel: den Rücken und insbesondere den Schulter– und Nackenbereich optimal zu entspannen. Anschaulich, leicht verständlich und Schritt für Schritt erklärt erarbeiten wir Techniken und Griffe um die Rückenmuskulatur besonders tiefgehend zu entspannen und somit das Wohlbefinden erheblich zu steigern. Die Rücken Massage ist eine feinfühlige, stark energetische Rückenmassage, die imstande ist, Blockaden zu lösen. \n" +
                    "Wirksam für folgende Indikationen: \n" +
                    "Bei Verspannungen im Nacken und Schulterbereich \n" +
                    "Wirkungsvolle Hilfe zur Stressbewältigung \n" +
                    "Zur Linderung von spannungsbedingten Kopfschmerzen Regulation von Durchblutungsstörungen im Bereich des oberen Rücken.",
                    "older": "Massage ist ein notwendiges und sehr nützliches Verfahren für ältere Menschen, Rentner. Studien haben gezeigt, dass die Massage den Alterungsprozess verlangsamt. Auch Massage hat eine beruhigende Wirkung im ganzen Körper und kann Schmerzen reduzieren. \n" +
                    "Мassage kann Menschen helfen, die unter Muskelschmerzen leiden: Zum Beispiel, diejenigen, die an Arthritis leiden, Massage hilft, Schmerzen zu reduzieren, erhöht die Amplitude der Bewegung in den Gelenken. Wenn eine Person leidet, wird sie immer weniger aktiv und beeinflusst die Lebensqualität und Gesundheit. Massage verbessert die Durchblutung, beseitigt Muskelermüdung und Muskeln erhalten Ton. Dies verbessert die Lebensqualität einer älteren Person. \n" +
                    "Vor einer Massage ist es ratsam, einen Arzt zu konsultieren. Sobald Sie die Erlaubnis vom Arzt für eine Massage bekommen, können Sie sich mit mir in Verbindung setzen.",
                    "relaxBody": "Entspannende Massage für diejenigen, die nach einem anstrengenden Tag entspannen wollen, vergessen und weg von der täglichen Routine. Beseitigt Spannung und Stress, Anfälle, und Kopfschmerzen, entspannt die Muskeln, wirkt sich positiv auf den inneren Zustand des Körpers, verbessert die Stimmung und liefert die Energie wieder hergestellt. \n" +
                    "Absolute Entspannung von Kopf bis Fuss. Die umfassende Massage löst Verspannungen, lockert Muskeln und verleiht neue Energie und Vitalität.",
                    "ajurved": "Ayurveda empfiehlt der Brüstemassage, denn hierdurch entsteht ein optimaler Stimulus zur Harmonisierung des weiblichen Hormonzyklus. Die Massage sorgt für straffe Haut und straffes Bindegewebe, verhindert Brustschmerzen, Verspannungen und Entzündungen im Brustbereich, beugt Zystenbildung und Brustkrebs vor, aktiviert das Herz und das Herzchakra. \n" +
                    "Die Massage wird mit der Verwendung von Pflanzenölen durchgeführt und dauert bis zu einer Stunde. Inklusive Arbeit mit dem Hals (Rücken– und Vorderflächen) und Schultern, Arbeiten mit dem Unterarmbereich, Hände, Bauch und natürlich mit der Brust.",
                    "antice": "Dies ist eine besonders effektive Möglichkeit zur Bekämpfung von Cellulite, die verwendet wird, uneben subkutanes (Cellulite) Probleme in spezifischen Problembereichen zu reduzieren – Oberschenkel, Gesäß und Bauch. \n" +
                    "Massage stimuliert die Zirkulation der Lymphe, erhöht Muskeltonus und Kontraktion durch die Reduzierung von Cellulite und Schwellungen. Löscht den Körper von Toxinen und hat eine ausgeprägte kosmetische Wirkung. \n" +
                    "Dies ist die kleinste Methode – verlässt keine Prellungen.\n" +
                    "Der tibetische Vakuum Cup wird verwendet.",
                    "relaxFoot": "Gebrauchte müde Füsse und Waden zu entspannen, erhöhen Vitalität, Verbesserung der Immunität. Dieses Verfahren eignet sich für viele Menschen, die stehen oder eine Menge Leute auch, die einen kalten Fusse haben. Massage der Füsse, Waden hilft, den ganzen Körper wiederherzustellen und zu atmen.",

                    "sepHead": "Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.",
                    "sepNeck": "Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden. \n" +
                    "Dies ist eine hervorragende Maßnahme zur Reduzierung von Kopf, Hals, Schulter Schmerzen, Taubheit Hände.",
                    "sepStoma": "Regt die Verdauung an, wirkt sich positiv auf die intra–abdominalen Organe aus, verbessert Magen– und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm.",
                    "sepWaist": "Verbessert die Blut– und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt enge Muskeln, Gesäß, Beinschmerzen, stärkt die geschwächten Muskeln. Verringert den Schmerz nach der Operation, reduziert die Entzündung der Nervenwurzeln."


                },
                "ru": {
                    "limphoBody": "Это безопасный эффективный способ укрепления здоровья и поддержания благосостояния. У здоровых людей это профилактическая мера для поддержания нормального метаболизма. Во время массажа регенерация поврежденных мягких тканей активирует воспалительные процессы, укрепляет иммунную систему, улучшает подачу кислорода в ткани. Это помогает устранить избыток жидкости из ткани и органов.\n" +
                    "Лимфодренаж подходит для тех, кто чувствует отек ног, или просто усталость. После долгого дня, он расслабляет уставшие ноги и дает ощущение легкости. Он также подходит для людей, чьи ноги всегда холодные.\n" +
                    "Эта цель красоты массажа используется для лечения и профилактики целлюлита, подтягивания кожи, улучшения общего состояния здоровья и уменьшить отек после пластической хирургии.\n" +
                    "Этот массаж проводится для женщин и мужчин.\n" +
                    "Для лечения – рекомендует делает каждый день, для профилактики – делать 2–3 раза в неделю. Желаемый эффект достигается после 15 процедур.",
                    "limphoFace": "При постоянном напряжении и усталости, мышцы лица замерзает бывает маска ,,печаль\". Лимфа cтекает сложнее, удаляя токсичные и метаболические продукты.\n" +
                    "Лицевой лимфатический дренаж дает отличные результаты:\n" +
                    "при опухлости лица\n" +
                    "при обезвоживание кожи\n" +
                    "ранние старение\n" +
                    "темные круги и мешки под глазами\n" +
                    "снижение эластичности тканей и мышц,\n" +
                    "Купероз на лицею\n" +
                    "Уменьшаетса лица вялось, мы получаем выраженую упругость лица, разглаживаетса морщины.\n" +
                    "Для профилактики – делать 2–3 раза в неделю. Желаемый эффект достигается после 15 процедур.",
                    "stoneHotCold": "Камни, используемые в массаже, собранных на побережье Балтийского моря. Они растут на протяжении тысяч лет на морском дне обогащает огромную силу и солоноватой воды нити в сочетании с солнечным светом колебания приобретают уникальные характеристики, которые влияют на организм человека.\n" +
                    "Камень имеет способность из мышц удалить токсины накопленные в результате стресса и нездорового образа жизни. Улучшает сон, помогает регулировать кровяное давление, положительно влияет на частоту сердечных сокращений, вызванные естественной силы тела, чтобы помочь преодолеть болезнь, ускоряет процесс потоков.\n" +
                    "Этот массаж особенно подходит от усталости, перенеся глубокий стресс, чувствуя в себе неоправданные расстройства нервозности, апатия, плохой сон. Легко и приятно устраняет боль в мышцах, спины, головы и шеи.",
                    "backSpin": "Этот массаж идеально подходит для людей, которые проводят весь день стоя или сидя, например, за компьютером или за рулем автомобиля, а также тяжело физически работая , когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах. Этот массаж особенно подходит после тренировки при длительной и кратковременной боли. Кроме того, неправильное положение позвоночника часто вызывает головную боль. \n" +
                    "Периодический массаж поможет вам избавиться от: \n" +
                    "частых болей в спине, \n" +
                    "головных болей, \n" +
                    "расслабить напряженные группы мышц. После массажа вы почувствуете себя расслабленным и энергичным.",
                    "older": "Массаж – необходимая и очень полезная процедура для пожилых людей, пенсионеров. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль. Массаж может помочь людям, страдающим от мышечных болей : Например, те кто страдает от артрита, массаж помогает уменьшить боль, увеличивает амплитуду движения в суставах. Когда человек страдает, он становится все менее и менее активным, влияющий на качество жизни и здоровье. Массаж улучшает кровообращение, устраняет мышечную усталость, а мышцы получают тонус. Это улучшает качество жизни пожилого человека. \n" +
                    "Перед массажем необходимо проконсультироваться с врачом. Как только вы получите разрешение врача на массаж, вы можете спокойно связаться со мной.",
                    "relaxBody": "Aсслабляющий массаж для тех, кто хочет расслабиться после напряженного рабочего дня, забыть и уйти от ежедневной рутины. Устраняет напряжение и стресс, спазмы cпины и головные боли, расслабляет мышцы, позитивно влияет на внутреннее состояние организма, улучшает настроение и восстанавливает энергию.",
                    "ajurved": "Он оказывает положительное влияние на всю систему репродуктивных органов у женщин и помогает сбалансировать гормональную систему, уменьшает неприятное ощущение груди, связанное с менструальным циклом, у грудей появляетса упругость, улучшается их форма, делает их более здоровыми и практически исчезает риск рака молочной железы. \n" +
                    "Массаж выполняется с применением растительных масел и длится до одного часа. Включает в себя работу с шеей (задняя и передняя поверхности) и плечами, работу с областью подмышек, руками, животом, и, конечно же, с грудью.",
                    "antice": "Это особенно эффективный способ борьбы с целлюлитом, который используется для уменьшения неравномерной подкожной (целлюлитной) проблемы в определенных проблемных областях – бедрах, ягодицах и брюшной полости. \n" +
                    "Массаж стимулирует циркуляцию лимфы, повышает мышечный тонус и сокращение за счет уменьшения целлюлита и припухлости. Очищает организм от шлаков и оказывает выраженный косметический эффект. \n" +
                    "Это является самым небольным методом – не оставляет синяков. Используется тибетская глиняная чаша",
                    "relaxFoot": "Используется для расслабления усталых стоп и голень, увеличения жизненого тонуса, повышения иммунитета. Эта процедура подходит для многих людей, которые работают стоя или много ходитб также людей у которых мёрзнит стопы. Массаж стоп, голень помогает восстановить и одохнуть всему телу.",

                    "sepHead": "Уменьшает стресс, головные боли, улучшает кровообращение.",
                    "sepNeck": "Наиболее эффективное средство для устранения неприятных симптомов. Уже после первого раза вы почувствуете улучшение общего состояния. После полного курса массажа исчезают болезненные ощущения, поевляетса бодрость, возрастает работоспособность, исчезает бессонница и раздражительность. Это отличный способ избавиться от боли в голове, шее, плечах и онемение рук.",
                    "sepStoma": "Стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.",
                    "sepWaist": "Улучшает циркуляцию крови и лимфы в пояснице и ногах, расслабляет напряженные мышцы, уменьшает поясничные, ягодицы, ногах боль, укрепляет ослабленные мышцы. Уменьшает боль после операции, уменьшает воспаление нервных корешков."


                }
            };
        },
        getPrices: function () {
            return {
                "lt": {
                    "title": "Kainos",
                    "spaTitle": ["Spa masažai", "60min", "90min", "120min"],
                    "limphoBody": ["Limfodrenažinis kūno masažas", "–", "140", "–"],
                    "limphoFace": ["Limfodrenažinis veido masažas", "100", "–", "–"],
                    "stoneHotCold": ["Karštų – šaltų akmenų masažas", "–", "–", "220"],
                    "backSpin": ["Klasikinis – segmentinis nugaros masažas", "100", "150", "–"],
                    // "older": ["Masažas vyresnio amžiaus žmonėms"],
                    "relaxBody": ["Atpalaiduojantis viso kūno masažas", "–", "–", "200"],
                    "ajurved": ["Ajurvedinis krūtų masažas moterims", "100", "–", "–"],
                    // "antice": ["Anticeliulitinis masažas rankomis"],
                    "relaxFoot": ["Atpalaiduojantis pėdų–blauzdų masažas", "100", "–", "–"],
                    "anticel": ["Anticeliulitiniai masažai", "–", "130", "180"],
                    "antiSed": ["Sėdmenų masažas", "–", "130", "180"],
                    "antiTig": ["Šlaunų masažas", "–", "130", "180"],
                    "antiSto": ["Pilvo masažas", "70", "130", "180"],
                    "antiTro": ["Žąsto masažas", "–", "130", "180"],
                    // "sepPar": ["Atskirų kūno dalių masažai", "30min", "60min", "90min"],
                    "sepPar": ["Atskirų kūno dalių masažai", "50", "100", "–"],

                    "waist": ["Juosmens, sėdmenų, kojų masažas", "50", "100", "–"],
                    "neck": ["Pečių, kaklo, rankų masažas", "50", "100", "–"],
                    "head": ["Galvos masažas", "50", "–", "–"],
                    "stoma": ["Pilvo masažas", "50", "–", "–"],
                    "kidsMas": ["Vaikams (12–15m)", "60min", "90min", "120min"],
                    "kidBackSpin": ["Klasikinis segmentinis nugaros masažas", "80", "120", "–"],
                    "kidsNeck": ["Pečių, kaklo, rankų masažas", "80", "–", "–"],
                    "kidsWaist": ["Juosmens, sėdmenų, kojų masažas", "80", "–", "–"],
                    "kidsFull": ["Viso kūno masažas", "–", "–", "160"],
                    "otherTitle": ["Kiti masažai", "30min", "60min", "90min"],



                },
                "de": {
                    "title": "Preise",
                    "spaTitle": ["Spa–Massagen", "60min", "90min", "120min"],
                    "limphoBody": ["Manuelle Lymphdrainage", "–", "140", "–"],
                    "limphoFace": ["Manuelle Lymphdrainage Gesicht", "100", "–", "–"],
                    "stoneHotCold": ["Heiß–kalt Steinmassage", "–", "–", "220"],
                    "backSpin": ["Rücken Massage", "100", "150", "–"],
                    // "older": ["Massage für ältere Menscher"],
                    "relaxBody": ["Entspannende Ganzkörpermassagе", "–", "–", "200"],
                    "ajurved": ["Ayurvedische Brüstmassage für Frauen", "100", "–", "–"],
                    // "antice": ["Anti–Cellulite massage"],
                    "relaxFoot": ["Entspannende Füße – Waden massage", "100", "–", "–"],
                    "anticel": ["Anti–Cellulite–Massagen", "–", "130", "180"],
                    "antiSed": ["Gesäß", "–", "130", "180"],
                    "antiTig": ["Die Oberschenkel", "–", "130", "180"],
                    "antiSto": ["Bauch", "70", "130", "180"],
                    "antiTro": ["Oberarmmassage", "–", "130", "180"],
                    // "sepPar": ["Teilkörpermassage", "30min", "60min", "90min"],
                    "sepPar": ["Teilkörpermassage", "50", "100", "–"],
                    "waist": ["Massage Schulter–Hals–Hände", "50", "100", "–"],
                    "neck": ["Lendenwirbel – Gesäß – Beinmassage", "50", "100", "–"],
                    "head": ["Kopfmassage", "50", "–", "–"],
                    "stoma": ["Bauchmassage", "50", "–", "–"],
                    "kidsMas": ["Für kinder ab 12 bis 15 jahren", "60min", "90min", "120min"],
                    "kidBackSpin": ["Rückenmassage", "80", "120", "–"],
                    "kidsNeck": ["Massage Schulter–Hals–Hände", "80", "–", "–"],
                    "kidsWaist": ["Lendenwirbel – Gesäß – Beinmassage", "80", "–", "–"],
                    "kidsFull": ["Ganzkörpermassagе", "–", "–", "160"],
                    "otherTitle": ["Andere Massagen", "30min", "60min", "90min"]
                },
                "ru": {
                    "title": "Цены",
                    "spaTitle": ["Спа–массажы", "60min", "90min", "120min"],
                    "limphoBody": ["Лимфодренажный массаж тела", "–", "140", "–"],
                    "limphoFace": ["Лимфодренажный массаж лица", "100", "–", "–"],
                    "stoneHotCold": ["Горячих – холодных камней массаж", "–", "–", "220"],
                    "backSpin": ["Классический – Сегментный массаж спины", "100", "150", "–"],
                    // "older": ["Массаж для пожилых людей"],
                    "relaxBody": ["Расслабляющий массаж всего тела", "–", "–", "200"],
                    "ajurved": ["Аюрведический массаж грудей", "100", "–", "–"],
                    // "antice": ["Антицеллюлитный массаж"],
                    "relaxFoot": ["Расслабляющий массаж стоп–голень", "100", "–", "–"],
                    "anticel": ["Антицеллюлитные массажы ", "–", "130", "180"],
                    "antiSed": ["Ягодицы", "–", "130", "180"],
                    "antiTig": ["Бедры", "–", "130", "180"],
                    "antiSto": ["Живота", "70", "130", "180"],
                    "antiTro": ["Массаж Предплечье", "–", "130", "180"],
                    // "sepPar": ["Массаж отдельнных частей тело", "30min", "60min", "90min"],
                    "sepPar": ["Массаж отдельнных частей тело", "50", "100", "–"],
                    "waist": ["Поясницы– Ягодицы – Ног массаж", "50", "100", "–"],
                    "neck": ["Плечо – шеи – рук массаж", "50", "100", "–"],
                    "head": ["Galvos masažas", "50", "–", "–"],
                    "stoma": ["Pilvo masažas", "50", "–", "–"],
                    "kidsMas": ["Для детей от 12 до 15 лет", "60min", "90min", "120min"],
                    "kidBackSpin": ["Классический – Сегментный массаж спины", "80", "120", "–"],
                    "kidsNeck": ["Плечо – шеи – рук массаж", "80", "–", "–"],
                    "kidsWaist": ["Поясницы– Ягодицы – Ног массаж", "80", "–", "–"],
                    "kidsFull": ["Массаж всего тела", "–", "–", "160"],
                    "otherTitle": ["Другие массажи", "30min", "60min", "90min"]
                }
            };


        },
        getFormNames: function () {
            return {
                "lt": {
                    "name": "Vardas",
                    "surname": "Pavardė",
                    "email": "Elektroninis paštas",
                    "phone": "Telefono numeris",
                    "massage": "Masažas",
                    "massageOption": "Trukmė",
                    "date": "Data",
                    "time": "Laikas",
                    "message": "Žinutė",
                    "button": "Rezervuoti",
                    "title": "Užsisakykite masažą jums patogiu laiku!",
                },
                "de": {
                    "name": "Name",
                    "surname": "Nachname",
                    "email": "E–Mail",
                    "phone": "Telefonnummer",
                    "massage": "Massage",
                    "massageOption": "Dauer",
                    "date": "Datum",
                    "time": "Zeit",
                    "message": "Nachricht",
                    "button": "Buche es",
                    "title": "Buchen Sie Ihre Massage nach Ihren Wünschen!"

                },
                "ru": {
                    "name": "Имя",
                    "surname": "Фамилия",
                    "email": "Электронная почта",
                    "phone": "Номер телефона",
                    "massage": "Массаж",
                    "massageOption": "Продолжительность",
                    "date": "Дата",
                    "time": "Время",
                    "message": "Сообщение",
                    "button": "Забронировать",
                    "title": "Зaкажите свой массаж в удобное для вас время!"

                }
            }
        },
        getPlaceHolders: function () {
            return {
                "lt": {
                    "name": "Įveskite vardą",
                    "surname": "Įveskite pavardę",
                    "email": "Įveskite elektroninį paštą",
                    "phone": "Įveskite telefono numerį",
                    "massage": "Pasirinkite masažą",
                    "massageOption": "Pasirinkitę masažo trukmę",
                    "date": "Pasirinkite datą",
                    "time": "Pasirinkite laiką",
                    "message": "Papildomi pageidavimai",

                },
                "de": {
                    "name": "Geben Sie einen Namen ein",
                    "surname": "Geben Sie einen Nachnamen ein",
                    "email": "E–Mail eingeben",
                    "phone": "Geben Sie eine Telefonnummer ein",
                    "massage": "Wählen Sie eine Massage",
                    "massageOption": "Die Dauer der Massage gewählt haben",
                    "date": "Wählen Sie ein Datum aus",
                    "time": "Wähle eine Zeit aus",
                    "message": "Zusätzliche Anfragen"

                },
                "ru": {
                    "name": "Введите имя",
                    "surname": "Введите фамилию",
                    "email": "Введите адрес электронной почты",
                    "phone": "Введите номер телефона",
                    "massage": "Выберите массаж",
                    "massageOption": "Выберите продолжительность массажа",
                    "date": "Выберите дату",
                    "time": "Выберите время",
                    "message": "Дополнительные запросы"
                }

            }

        },
        getFormErrors: function () {
            return {
                "lt": {
                    "name": "Neįvestas vardas",
                    "surname": "Neįvesta pavardė",
                    "email": "Neįvestas elektroninis paštas",
                    "phone": "Neįvestas telefono numeris",
                    "massage": "Nepasirinktas masažas",
                    "massageOption": "Nepasirinkta masažo trukmė",
                    "date": "Nepasirinkta data",
                    "time": "Nepasirinktas laikas",
                    "emailBadFormat": "Neteisingas elektroninio pašto adresas",
                    "captcha": "Patvirtinkite, kad esate ne robotas"
                },
                "de": {
                    "name": "Kein Name eingegeben",
                    "surname": "Nachname nicht eingegeben",
                    "email": "Keine E–Mail–Adresse eingegeben",
                    "phone": "Telefonnummer nicht eingegeben",
                    "massage": "Massage ist nicht ausgewählt",
                    "massageOption": "Die Massagezeit ist nicht ausgewählt",
                    "date": "Kein Datum ausgewählt",
                    "time": "Keine Zeit ausgewählt",
                    "emailBadFormat": "Ungültige E–Mail–Adresse",
                    "captcha": "Patvirtinkite, kad esate ne robotas"


                },
                "ru": {
                    "name": "Имя не введено",
                    "surname": "Фамилия не введена",
                    "email": "Не введено электронное письмо",
                    "phone": "Номер телефона не введен",
                    "massage": "Массаж не выбран",
                    "massageOption": "Продолжительность массажа не выбрано",
                    "date": "Дата не выбрана",
                    "time": "Не выбрано времени",
                    "emailBadFormat": "Недопустимый адрес электронной почты",
                    "captcha": "Patvirtinkite, kad esate ne robotas"


                }
            }
        },
        getContactUsData: function () {
            return {
                "lt": {
                    "secTitle": "Susisiekite su mumis",
                    "sentence": "Turite klausimų?  Klauskite ir atsakysime. Taip pat mus galite sekti socialiniuose tinkluose.",
                    "title": "Klauskite",
                    "name": "Vardas",
                    "namePH": "Įveskite vardą",
                    "email": "Elektroninis paštas",
                    "emailPH": "Įveskite elektroninį paštą",
                    "question": "Žinutė",
                    "questionPH": "Jūsų žinutė",
                    "button": "Siųsti",
                    "socNet": "Mūsų socialiniai tinklai",
                    "contacts": "Mūsų kontaktai"
                },
                "de": {
                    "secTitle": "Kontaktiere uns",
                    "sentence": "Haben Sie Fragen? Frage und antworte. Sie können uns auch in sozialen Netzwerken folgen.",
                    "title": "Fragen",
                    "name": "Name",
                    "namePH": "Geben Sie einen Namen ein",
                    "email": "E–Mail",
                    "emailPH": "E–Mail eingeben",
                    "question": "Frage",
                    "questionPH": "Deine Frage",
                    "button": "Senden",
                    "socNet": "Unsere sozialen Netzwerke",
                    "contacts": "Unsere Kontakte"

                },
                "ru": {
                    "secTitle": "Свяжитесь с нами",
                    "sentence": "Есть вопросы? Спросите и ответьте. Вы также можете следить за нами в социальных сетях.",
                    "title": "Спрашивать",
                    "name": "Имя",
                    "namePH": "Введите имя",
                    "email": "Электронная почта",
                    "emailPH": "Введите адрес электронной почты",
                    "question": "Вопрос",
                    "questionPH": "Ваш вопрос",
                    "button": "Послать",
                    "socNet": "Наши социальные сети",
                    "contacts": "Наши контакты"

                }
            }
        },
        getContactFormErrors: function () {
            return {
                "lt": {
                    "name": "Neįvestas vardas",
                    "email": "Neįvestas elektroninis paštas",
                    "emailBadFormat": "Neteisingas elektroninio pašto adresas",
                    "message": "Neįvesta žinutė",
                    "captcha": "Patvirtinkite, kad esate ne robotas"
                },
                "de": {
                    "name": "Kein Name eingegeben",
                    "email": "Keine E–Mail–Adresse eingegeben",
                    "emailBadFormat": "Ungültige E–Mail–Adresse",
                    "message": "Nachricht nicht eingegeben",
                    "captcha": "Bitte bestätigen Sie, dass Sie kein Roboter sind"

                },
                "ru": {
                    "name": "Имя не введено",
                    "email": "Не введено электронное письмо",
                    "emailBadFormat": "Недопустимый адрес электронной почты",
                    "message": "Сообщение не введено",
                    "captcha": "Пожалуйста, подтвердите, что вы не робот"

                }
            }

        },

        getMassagesFromBackend: function () {
            return {
                "lt": {
                    "limphoBody": [
                        ["Limfodrenažinis kūno masažas", "0"], ["Limfodrenažinis veido masažas", "1"], ["Karštų – šaltų akmenų masažas", "2"], ["Klasikinis – segmentinis nugaros masažas", "3"], ["Atpalaiduojantis viso kūno masažas", "4"], ["Ajurvedinis krūtų masažas moterims", "5"], ["Atpalaiduojantis pėdų masažas", "6"]]

                },
                "de": {
                    "limphoBody": [
                        ["Manuelle Lymphdrainage", "0"], ["Manuelle Lymphdrainage Gesicht", "1"], ["Heiß – kalt Steinmassage", "2"], ["Rücken Massage", "3"], ["Entspannende Ganzkörpermassagе", "4"], ["Ayurvedische Brüstmassage für Frauen", "5"], ["Entspannende Fussmassage", "6"]]

                },
                "ru": {
                    "limphoBody": [
                        ["Лимфодренажный массаж тела", "0"], ["Лимфодренажный массаж лица", "1"], ["Горячих – холодных камней массаж", "2"], ["Классический – Сегментный массаж спины", "3"], ["Расслабляющий массаж всего тела", "4"], ["Аюрведический массаж грудей", "5"], ["Расслабляющий массаж стоп", "6"]]

                }
            }
        },

        getFullFormBackendErrorMessages: function () {
            return {
                "lt": {
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "nameLength": "Vardas negali būti tuščias arba ilgesnis nei 100 simbolių",
                    "surnameFormat": "Pavardė negali turėti skaičių bei specialių simbolių",
                    "surnameLength": "Pavardė negali būti tuščia arba ilgesnė nei 100 simbolių",
                    "emailFormat": "Pasitikrinkite ar teisingai įvedėte elektroninio pašto adresą",
                    "emailLength": "Elektroninis paštas negali viršyti 100 simbolių",
                    "phoneFormat": "Neteisingai įvestas telefono numeris",
                    "phoneLength": "Telefono numeris negali būti ilgesnis nei 20 simbolių",
                    "massageFormat": "Shit happened1",
                    "massageLength": "Shit happened2",
                    "massageOptionFormat": "Shit happened3",
                    "massageOptionLength": "Shit happened4",
                    "dateFormat": "Neteisingas datos formatas",
                    "dateLength": "Shit happened5",
                    "timeFormat": "Neteisingas laiko formatas",
                    "timeLength": "Shit happened5",
                    "messageLength": "Žinutė negali viršyti 1000 simbolių",
                    "messageFormat": "Shit happened6",
                    "captchaFormat": "Išspręskite užduotį, kad patvirtintumėte, jog nesate robotas"
                },
                "de": {
                    "nameFormat": "blah blah",
                    "nameLength": "",
                    "surnameFormat": "",
                    "surnameLength": "",
                    "emailFormat": "",
                    "emailLength": "",
                    "phoneFormat": "",
                    "phoneLength": "",
                    "massageFormat": "",
                    "massageLength": "",
                    "massageOptionFormat": "",
                    "massageOptionLength": "",
                    "dateFormat": "",
                    "dateLength": "",
                    "timeFormat": "",
                    "timeLength": "",
                    "messageLength": "",
                    "messageFormat": "",
                    "captchaFormat": ""


                },
                "ru": {
                    "nameFormat": "blah blah",
                    "nameLength": "",
                    "surnameFormat": "",
                    "surnameLength": "",
                    "emailFormat": "",
                    "emailLength": "",
                    "phoneFormat": "",
                    "phoneLength": "",
                    "massageFormat": "",
                    "massageLength": "",
                    "massageOptionFormat": "",
                    "massageOptionLength": "",
                    "dateFormat": "",
                    "dateLength": "",
                    "timeFormat": "",
                    "timeLength": "",
                    "messageLength": "",
                    "messageFormat": "",
                    "captchaFormat": ""


                }
            }
        },
        getContactFormBackendErrorMessages: function () {
            return {
                "lt": {
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "nameLength": "Vardas negali būti tuščias arba ilgesnis nei 100 simbolių",
                    "emailFormat": "Pasitikrinkite ar teisingai įvedėte elektroninio pašto adresą",
                    "emailLength": "Elektroninis paštas negali viršyti 100 simbolių",
                    "messageLength": "Žinutė negali viršyti 1000 simbolių",
                    "messageFormat": "Shit happened6",
                    "captchaFormat": "Išspręskite užduotį, kad patvirtintumėte, jog nesate robotas"
                },
                "de": {
                    "nameFormat": "blah blah",
                    "nameLength": "",
                    "emailFormat": "",
                    "emailLength": "",
                    "messageLength": "",
                    "messageFormat": "",
                    "captchaFormat": ""


                },
                "ru": {
                    "nameFormat": "blah blah",
                    "nameLength": "",
                    "emailFormat": "",
                    "emailLength": "",
                    "messageLength": "",
                    "messageFormat": "",
                    "captchaFormat": ""


                }
            }
        },
        getSucRespFullBookForm: function () {
            return {
                "lt": {
                    "response": "Ačiū, Jūsų laikas rezervuotas."

                },
                "de": {
                    "response": "Danke, Ihre Zeit ist reserviert."


                },
                "ru": {
                    "response": "Спасибо, ваше время зарезервировано."


                }
            }
        },
        getSucRespContactUsForm: function () {
            return {
                "lt": {
                    "response": "Ačiū, Jūsų klausimas gautas."

                },
                "de": {
                    "response": "Danke, Ihre Frage wurde empfangen."


                },
                "ru": {
                    "response": "Спасибо, ваш вопрос получен."


                }
            }
        }
    }


});
















