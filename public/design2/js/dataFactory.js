var gg = angular.module('dataFactoryApp', []); //ngMessages

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
                    "bookNow": "Rezervuokite laiką",
                    "opening0":"Ab 27.04.2020",
                    "opening1":"Ich werde wieder massieren.",
                    "opening2":"Bitte vorregistrieren:",
                    "opening3":"Rufe Sie mich an: +41 79 789 70 10",
                    "opening4":"oder",
                    "opening5":"Online Website: www.vidamassage.ch",
                    "discount":"Visą vasario mėnesį -35% nuolaida masažams",
                    "discount2":"Su kodu:",
                    "discount3":"Visą vasario mėnesį -35% nuolaida masažams su kodu: ",
                    "widgetFailure":"Pastaba: jei užsakymas negalimas žemiau, iš naujo perkraukite puslapį. Vyksta problemos šalinimas. Atsiprašome už nepatogumus!"

                },
                "de": {
                    "intro": "Die Massage bietet eine heilsame Wirkung auf Körper und Seele. Es gibt nichts Schöneres als sich nach einem harten und müden Arbeitstag bei einer Massage Ihrer Wahl zu entspannen – gönnen Sie sich diese Auszeit!",
                    "findMore": "Erfahren Sie mehr",
                    "bookNow": "Sparen Sie Zeit",
                    "opening0":"Ab 27.04.2020",
                    "opening1":"Ich werde wieder massieren.",
                    "opening2":"Bitte vorregistrieren:",
                    "opening3":"Rufe Sie mich an: +41 79 789 70 10",
                    "opening4":"oder",
                    "opening5":"Online Website: www.vidamassage.ch",
                    "discount":"Erhalten Sie -35% Rabatt auf ausgewählte Massage",
                    "discount2":"Mit Rabatt Code:",
                    "discount3":"Erhalten Sie -35% Rabatt auf ausgewählte Massage Mit Rabatt Code: ",
                    "widgetFailure":"Hinweis: Wenn die Buchung unten nicht verfügbar ist, laden Sie die Seite neu. Die Problembehandlung ist noch nicht abgeschlossen. Entschuldigung für die Unannehmlichkeiten!"


                },
                "ru": {
                    "intro": "Массаж является одним из особых факторов в жизни человека, помогая поддерживать хорошее тело и душу. И нет ничего лучше, чем после тяжелого и усталого рабочего дня, расслабиться и оживить cвое тело массажными процедурами.",
                    "findMore": "Узнайте больше",
                    "bookNow": "резервировать время",
                    "opening0":"Ab 27.04.2020",
                    "opening1":"Ich werde wieder massieren.",
                    "opening2":"Bitte vorregistrieren:",
                    "opening3":"Rufe Sie mich an: +41 79 789 70 10",
                    "opening4":"oder",
                    "opening5":"Online Website: www.vidamassage.ch",
                    "discount":"Весь февраль скидка -35% на массажи",
                    "discount2":"C кодом:",
                    "discount3":"Весь февраль скидка -35% на массажи c кодом: ",
                    "widgetFailure":"Примечание: если бронирование не доступно ниже, пожалуйста, перезагрузите страницу. Поиск и устранение неисправностей продолжается. Приносим извинения за неудобства!"

                }
            }

        },
        getNavBarData: function () {
            return {

                "lt": {
                    "about": "Apie mane",
                    "massages": "Masažai",
                    "gallery": "Galerija",
                    "prices": "Kainos",
                    "book": "Užsakyti",
                    "giftCard":"Dovanų kuponai",
                    "contacts": "Kontaktai",
                },
                "de": {
                    "about": "Über mich",
                    "massages": "Massagen",
                    "gallery": "Galerie",
                    "prices": "Preise",
                    "book": "Reservation",
                    "giftCard":"Gutscheine",
                    "contacts": "Kontakte",
                },
                "ru": {
                    "about": "Oбо мне",
                    "massages": "Mассажи",
                    "gallery": "Галерея",
                    "prices": "Цена",
                    "book": "Заказать",
                    "giftCard":"подарочная карта",
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
                    "spa": "Sertifikatai",
                    "title": "Jūsų paslaugoms"
                },
                "de": {
                    "whoIAm": "Wer bin ich?",
                    "exp": "Bildung",
                    "workExp": "Berufserfahrung",
                    "spa": "Zertifikate",
                    "title": "Zu Ihren Diensten"
                },
                "ru": {
                    "whoIAm": "Kто я?",
                    "exp": "Oбразование",
                    "workExp": "Oпыт работы",
                    "spa": "Сертификаты",
                    "title": "К вашим услугам"
                }
            }
        },

        getAboutMeBody: function () {
            return {
                "lt": {
                    "whoIAm": ["Mano vardas Vida. Atvykau iš Lietuvos. Gyvenu Šveicarijoje, Schaffhausen mieste", "Man masažai – tai iššūkis ir malonumas", "Iššūkis – panaikinti skausmus žmogaus kūne", "Malonumas – kai nebelieka skausmų, dingsta įtampa, grąžinama gera savijauta, o žmogaus veide atsiranda šypsena", "Mano tikslas yra padėti žmonėms jaustis puikiai, bet kuriuo amžiaus periodu"],
                    "exp": ["Vilniaus aukštesnioji medicinos mokykla. Lietuva", "Klaipėdos universitetas. Bakalauro laipsnis “Visuomenės sveikata”. Lietuva", "\"Baltic SPA Professional\" kursai (Latvija), SPA masažai", "Slaugos darbuotojų tobulinimosi ir specializacijos centras: Pažymėjimas Nr. KV 120146 – suteikta teisė daryti gydomuosius masažus"],
                    "workExp": ["27 metai: medicinos sesuo", "8 metai: visuomenės sveikatos priežiūros specialistė", "10 metų: masažuotoja","3 metai: individuali veikla \"Fizinės gerovės užtikrinimo veikla\". Lietuva"],
                    "spa": ["Klasikinis segmentinis masažas", "Karštų akmenų masažas", "Limfodrenažinis masažas", "Tajų masažas", "Tradicinis ajurvedinis Keralos masažas", "Gydomieji masažai"],
                    "welcome":["Džiaugiuosi galėdama pasveikinti Jus mano masažo praktikoje!"],
                    "welcome2":["Linkiu gero laiko ir iki greito pasimatymo!"],
                    "hob1":["Pomėgiai:"],
                    "hob2":["Snieglenčių sportas, Skaitymas, Bėgimas, Sodas"]
                },
                "de": {
                    "whoIAm": ["Meine Name ist Vida. Ich komme aus Litauen. Ich wohne jetzt in der Schweiz, in der Stadt Schaffhausen", "Für mich ist Massage eine Herausforderung und ein Vergnügen.", "Die Herausforderung – Schmerzen im Körper nachhaltig zu lindern", "Das Vergnügen – Körper, Geist und Seele in Einklang zu bringen und auf natürliche Weise ein Lächeln auf den Gesichtern der Menschen erscheinen zu lassen", "Mein Ziel – den Leuten zu helfen, sich in jedem Alter gut zu fühlen"],
                    "exp": ["Vilnius Höhere Medizinische Fakultät Litauen", "Klaipeda Universität. Bachelor Öffentliches Gesundheitswesen verliehen. Litauen", "\"Baltic SPA Profi\" Kurse (Lettland), SPA/Wellness–Massagen", "Zentrum für Entwicklung und Spezialisierung des Pflegepersonals. Zertifikat Nr. 120146 KV – das Recht hat therapeutische Massage zu machen."],
                    "workExp": ["27 Jahre: eine Krankenschwester", "8 Jahre: Facharzt für Gesundheitswesen", "10 Jahre: Masseurin","3 Jahre individuelle Aktivität \"Aktivitäten zum körperlichen Wohlbefinden\". Litauen"],
                    "spa": ["Klassische Segmentmassage", "Hot Stone Massage", "Lymphdrainage-Massage", "Thai-Massage", "Traditional Kerala Ayurveda – Massage", "Therapeutische Massage"],
                    "welcome":["Ich freue mich, Sie in meiner Massagepraxis zu begrüssen!"],
                    "welcome2":["Ich wünsche Ihnen eine gute Zeit und bis bald!"],
                    "hob1":["Hobbys:"],
                    "hob2":["Snowboarding, Lesen, Laufen, Garten"]
                },
                "ru": {
                    "whoIAm": ["Меня зовут Вида. Я приехала из Литвы. Теперь живу в Швейцарии, в городе Шаффхаузен", "Для меня массаж – это вызов и удовольствие", "Вызов – устранить боль в теле человека", "Удовольствие – когда нет больше боли, напряжение исчезает, возвращается хорошее самочувствие, а на лице человека появляется улыбка", "Моя цель – помочь людям чувствовать себя прекрасно в любом возрасте"],
                    "exp": ["Вильнюсская высшая медицинская школа. Литва", "Клайпедский университет. Степень бакалавра в области общественного здравоохранения. Литва", "\"Baltic SPA Professional\" курсы (Латвия), спа–массажи", "Центр развития и специализации медсестринского персонала: Сертификат Нет. KV 120146 – предоставляется право делать терапевтические (лечебные) массажи"],
                    "workExp": ["27 лет: медицинская сестра", "8 лет: специалист общественного здравоохранения", "10 лет: массажист","3 года: индивидуальная деятельность «Физкультурно-оздоровительная деятельность». Литва"],
                    "spa": ["Классический сегментарный массаж", "Массаж горячими камнями", "Лимфодренажный массаж", "Тайский массаж", "Традиционный аюрведический Керал массаж", "Лечебные массажи"],
                    "welcome":["Я рада приветствовать Вас в моей массажной практике!"],
                    "welcome2":["Желаю вам хорошего времени и до скорой встречи!"],
                    "hob1":["Хобби:"],
                    "hob2":["Сноубординг, Чтение, Бег, Сад"]
                }
            }
        },

        getBulletPoints: function(){
            return {
                "lt": {
                    "limphoBodyBul1": ["Mažinant kūno svorį;", "Esant kojų patinimams;", "Esant odos suglebimui;", "Po operacijų ir t.t."],
                    "limphoBodyBulTit1": ["Rekomenduojamas:", "Profilaktikai:"],
                    "limphoBodyBul2": ["Išsiplėtusių kojų venų."],

                    "limphoFaceBul1": ["Pašalinti iš organizmo nereikalingus skysčius, šlakus, pašalinti patinimus.", "Atsikratyti chroniško nuovargio, įtampos, galvos skausmų, taip pat pakrauti organizmą.", "Pagerinti veido spalvą ir odos būklę: pašalindamas nedidelę įtampą, manualinis limfodrenažas pagerina kraujotaką, todėl oda, gavusi pilnavertį maitinimą, atrodo elastingesnė, gyvesnė ir sveikesnė, be to, išsilygina raukšlės."],
                    "limphoFaceBulTit1": ["Rankinis limfodrenažas leis per trumpą laiką:", "Veido limfodrenažas suteikia puikių rezultatų prie:"],
                    "limphoFaceBul2": ["veido pabrinkimo,","išsausėjusios odos,","ankstyvojo senėjimo,","tamsių ratilų ir maišelių po akimis,","sumažėjusio audinių elastingumo,","kovojant su kuperoze."],

                    "HotColdStoneBul1": ["pagerina miegą,","teigiamas poveikis širdies susitraukimų dažniui, kurį sukelia natūrali organizmo jėga, padedanti įveikti ligą, pagreitina srauto procesą."],
                    "HotColdStoneTit1": ["Taip pat:", "Masažas yra efektyvus esant:"],
                    "HotColdStoneBul2": ["nugaros ir kaklo skausmams,","teigiamai veikia nervų sistemą,","lėtiniam nuovargiui,","migrenai,","pirštų tirpimui,","šalčio pojūčiui galūnėse ir t.t."],

                    "backSpinBul1": ["prie kompiuterio ar vairuodami automobilį,", "dirbantiems sėdimą ar sunkų fizinį darbą kai visa įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi raumenų mazgai.", "Šis masažas ypač tinka po treniruočių.","Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą."],

                    "relaxBodyBulTit1":["Pašalina:"],
                    "relaxBodyBul1":["įtampą ir stresą","atslūgsta nugaros ir galvos skausmai","atsipalaiduoja raumenys","teigiamai veikia vidinę organizmo būseną","pagerina nuotaiką bei grąžina energiją"]


                },
                "de": {
                    "limphoBodyBul1": ["Verringerung des Körpergewichts;", "Beinschwellung;", "Reduzierte Hautelastizität;", "nach der Operation usw."],
                    "limphoBodyBulTit1": ["Empfohlen:", "Prophylaxe:"],
                    "limphoBodyBul2": ["Krampfadern in den Beinen."],

                    "limphoFaceBul1": ["Befreien von chronischer Müdigkeit, Verspannungen, Kopfschmerzen sowie der Belastung des Körpers.","Verbessern Sie die Gesichtsfarbe und den Hautzustand: Durch die Beseitigung von Verspannungen verbessert die manuelle Lymphdrainage die Blutzirkulation.  Die Haut nach der vollwertigen Ernährung elastischer, lebendiger und gesünder aussieht und Falten glättet."],
                    "limphoFaceBulTit1": ["Manuelle Lymphdrainage gibt für kurze Zeit :", "Die Lymphdrainage des Gesichts liefert hervorragende Ergebnisse bei:"],
                    "limphoFaceBul2": ["Schwellung des Gesichts,","trockene Haut,","frühes Altern,","dunkle Kreise und Taschen unter den Augen,","reduzierte Gewebeelastizität,","Bekämpfung von Kuperosis."],

                    "HotColdStoneBul1": ["schmerzen im Rücken und Nacken,"],
                    "HotColdStoneTit1": ["Massage ist wirksam bei:"],
                    "HotColdStoneBul2": ["eine positive Wirkung auf das Nervensystem","chronische Müdigkeit","Migräne","Taubheit der Finger","Erkältung in den Gliedmaßen usw."],

                    "backSpinBul1": ["am Computer oder beim Autofahren;", "sowie schwere körperliche Arbeit, wenn die ganze Macht in der Wirbelsäule, Nacken konzentriert, Schultern, Hüfte und Gesäß, Schmerzen in den Muskeln verursacht.", "Diese Massage eignet sich besonders nach dem Training.","Außerdem verursacht die falsche Position der Wirbelsäule oft Kopfschmerzen."],

                    "relaxBodyBulTit1":["Entfernt:"],
                    "relaxBodyBul1":["Spannung und Stress","Rücken- und Kopfschmerzen","Entspannt die Muskeln","wirkt sich positiv auf den inneren Zustand des Organismus aus","verbessert Stimmung und Energie"]




                },
                "ru": {
                    "limphoBodyBul1": ["Cнижение массы тела;", "Oтечность ног;", "Пониженная упругость кожи;", "После операции и т. Д."],
                    "limphoBodyBulTit1": ["Рекомендуется", "Профилактика:"],
                    "limphoBodyBul2": ["Варикозное расширение вен на ногах."],

                    "limphoFaceBul1": ["вывести лишнюю жидкость, шлаки, снять отёки и одутловатость лица.", "снять хроническую усталость, напряжение, подавленность, головные боли, зарядить организм энергией.", "улучшить цвет лица и состояние кожи: снимая малейшие мышечные напряжения, лимфодренаж улучшает кровообращение, получая полноценное питание, кожа выглядит более эластичной, свежей и здоровой, разглаживаются морщины."],
                    "limphoFaceBulTit1": ["Позволит за короткий срок:", "Лимфодренаж лица обеспечивает отличные результаты при:"],
                    "limphoFaceBul2": ["отеки лица,","сухости кожи,","раннем старении,","темных кругах и мешках под глазами,","снижение эластичности тканей,","борьбе с купоросом."],

                    "HotColdStoneBul1": ["улучшает сон,","положительно влияет на частоту сердечных сокращений."],
                    "HotColdStoneTit1": ["А также:", "Массаж эффективен при:"],
                    "HotColdStoneBul2": ["боль в спине и шее,","положительно влияет на нервную систему,","хронической усталости,","мигрени,","онемение пальцев,","ощущение холода в конечностях и т. д."],

                    "backSpinBul1": ["за компьютером или за рулем автомобиля,", "а также тяжело физически работая, когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах..", "Этот массаж особенно подходит после тренировки.","Кроме того, неправильное положение позвоночника часто вызывает головную боль."],

                    "relaxBodyBulTit1":["Удаляет:"],
                    "relaxBodyBul1":["напряжение и стресс","боли в спине и голове","расслабляет мышцы","оказывает положительное влияние на внутреннее состояние организма","улучшает настроение и энергию"]

                }
            }
        },

        getMassagesTitles: function () {
            return {
                "lt": {
                    "limphoBody": "Limfodrenažinis kūno masažas (metodika pagal Pascal Kose)",
                    "limphoFace": "Limfodrenažinis veido masažas (metodika pagal Pascal Kose)",
                    "stoneHotCold": "Viso kūno masažas su karštais ir šaltais akmenimis",
                    "backSpin": "Klasikinis – segmentinis nugaros masažas",
                    "older": "Masažas vyresnio amžiaus žmonėms",
                    "relaxBody": "Atpalaiduojantis viso kūno masažas",
                    "ajurved": "Ajurvedinis krūtų masažas moterims",
                    "antice": "Anticeliulitinis masažas rankomis (kojos, sėdmuo) ir vakuumine taurele",
                    "relaxFoot": "Sveikatą gerinantis pėdų masažas (+blauzdos)",
                    "sepHead": "Galvos masažas",
                    "sepNeck": "Pečių – kaklo – rankų masažas",
                    "sepStoma": "Pilvo masažas",
                    "sepWaist": "Juosmens – sėdmenų – kojų masažas",
                    "sepPar": "Juosmens – sėdmenų – kojų masažas",
                    "labelMore": "Daugiau",
                    "labelLess": "Mažiau",
                    "buttonReserve": "Rezervuoti",
                    "collar":"Apykaklės masažas",
                    "senior":"Masažas Senjorams",
                    "stoneHotSpin":"Nugaros karštų akmenų masažas"
                },
                "de": {
                    "limphoBody": "Lymphdrainage-Körpermassage (Methodik von Pascal Kose)",
                    "limphoFace": "Gesichtsmassage (Methodik von Pascal Kose)",
                    "stoneHotCold": "Ganzkörpermassage mit heißen und kalten Steinen",
                    "backSpin": "Klassische – segmentale Rückenmassage",
                    "older": "Massage für ältere Menscher",
                    "relaxBody": "Entspannende Ganzkörpermassagе",
                    "ajurved": "Ayurvedische Brust-Massage für Frauen",
                    "antice": "Anti - Cellulite Massage (Beine und das Gesäß) von Hand und mit der Vakuumschale",
                    "relaxFoot": "Entspannende Fußmassage (+ Waden)",
                    "sepHead": "Kopfmassage",
                    "sepNeck": "Massage Schulter – Hals – Hände",
                    "sepStoma": "Bauchmassage",
                    "sepWaist": "Lendenwirbel – Gesäß – Beinmassage",
                    "sepPar": "Lendenwirbel– Gesäß- und Beinmassage",
                    "labelMore": "Mehr",
                    "labelLess": "Weniger",
                    "buttonReserve": "Reservieren",
                    "collar":"Schultern - Nacken - Kragen Massage",
                    "senior":"Massage für Senioren",
                    "stoneHotSpin":"Rückenmassage mit heißen Steinen"

                },
                "ru": {
                    "limphoBody": "Лимфодренажный массаж тела (методика Паскаль Коше)",
                    "limphoFace": "Лимфодренажный массаж лица (методика Паскаль Коше)",
                    "stoneHotCold": "Массаж всего тела с горячими и холодными камнями",
                    "backSpin": "Классический – Сегментный массаж спины",
                    "older": "Массаж для пожилых людей",
                    "relaxBody": "Расслабляющий массаж всего тела",
                    "ajurved": "Аюрведический массаж грудей (для женщин)",
                    "antice": "Антицеллюлитный массаж (Ноги и ягодицы) вручную и вакуумной чашей",
                    "relaxFoot": "Оздоровительный массаж стоп (+голень)",
                    "sepHead": "Массаж головы",
                    "sepNeck": "Плечо – шеи – рук массаж",
                    "sepStoma": "Абдоминальный массаж",
                    "sepWaist": "Поясницы – Ягодицы – Ног Массаж",
                    "sepPar": "Поясницы- Ягодицы - Ног Массаж",
                    "labelMore": "Больше",
                    "labelLess": "Меньше",
                    "buttonReserve": "Резервировать",
                    "collar":"Массаж шейно-воротниковой зоны",
                    "senior":"Массаж для пенсионеров",
                    "stoneHotSpin":"Массаж спины с горячими камнями"

                }
            };
        },
        getMassageBodyData: function () {
            return {
                "lt": {
                    "limphoBody": "Tai specialus viso kūno masažas, skiriamas ląstelių medžiagų apykaitos produktų, toksinų ir skysčių pertekliui pašalinti iš audinių. Masažas tinka visiems, kurie jaučia kojų paburkimą ar tiesiog nuovargį. Po ilgos darbo dienos jis puikiai atpalaiduoja pavargusias kojas ir suteikia lengvumo pojūtį. Po limfodrenažo kurso pranyksta pastovus, chroniškas nuovargis ir galvos skausmas, sumažinamas galūnių tinimas - limfedema (limfinė edema), pagerėja odos elastingumas. Norimas efektas pasiekiamas maždaug per 15 procedūrų. Profilaktiškai rekomenduojama atlikti 3 - 5 manualinio limfodrenažo seansus (kartą per dvi savaites), terapija akivaizdžiai ir ilgam pagerina Jūsų išvaizdą ir savijautą. Limfodrenažinis kūno masažas atliekamas tiek moterims, tiek vyrams.",
                    "limphoBody2": "Masažas yra neskausmingas, malonus, o tam, kad būtų atkurta limfinės sistemos veikla ir matomi akivaizdūs rezultatai, paprastai užtenka maždaug 10 seansų. Masažo metu limfos cirkuliacija suaktyvinama net iki 10 kartų!",
                    "limphoFace": "Esant nuolatiniam stresui ir nuovargiui, veido raumenys sustingsta \"liūdesio\"  kaukėje.\n" +
                    "Jei limfos sistema užteršta, tada sunkėja limfos nutekėjimas,  medžiagų apykaitos procesai organizme sulėtėja.\n" +
                    "Masažas gerina veido spalvą ir odos būklę. Pašalinama veide įtampa,  pagerėja kraujotaka, todėl oda, gavusi pilnavertį maitinimą, atrodo elastingesnė, gyvesnė ir sveikesnė.\n" +
                    "Veido limfodrenažas suteikia puikių rezultatų prie: veido pabrinkimo, išsausėjusios odos, ankstyvojo senėjimo, tamsių ratilų ir maišelių po akimis, sumažėjusio audinių elastingumo ir kovojant su kuperoze.\n" +
                    "Sumažinę veido suglebimą, sulaukiame ryškaus standinamojo efekto.\n" +
                    "\n" +
                    "Terapijai ši procedūra skiriama kasdien arba kas antrą dieną. Norimas efektas pasiekiamas maždaug per 15 procedūrų. \n" +
                    "Profilaktiškai rekomenduojama atlikti 3 - 5 manualinio limfodrenažo seansus (kartą per dvi savaites) terapija akivaizdžiai ir ilgam pagerina Jūsų išvaizdą ir savijautą.\n" +
                    "Limfodrenažinis veido masažas atliekamas tiek moterims, tiek vyrams.\n",
                    "stoneHotCold":"Akmenys, naudojami masažui buvo surinkti Baltijos pakrantėje. Jie, tūkstantmečiais augdami jūros dugne prisisodrina didžiule sūrių vandenų galia ir išmesti į krantą susijungia su Saulės spindulių vibracijomis įgyja unikalias savybes, kurios veikia žmogaus kūną.\n" +
                    "Akmenys turi gebėjimą iš raumenų pašalinti toksinus sukauptus dėl streso ir nesveiko gyvenimo būdo. Pagerinamas miegas. Masažas yra efektyvus esant nugaros ir kaklo skausmams, teigiamai veikia nervų sistemą, lėtiniam nuovargiui, migrenai, pirštų tirpimui, šalčio pojūčiui galūnėse ir t.t.\n" +
                    "Po masažo jausitės pailsėję ir atgausite jėgas po kūną pasklis jauki šiluma, grįš fizinė ir emocinė pusiausvyra.\n" +
                    "\n" +
                    "Nėštumo metu, vėžio ir infekcinių ligų atveju, šis masažas nerekomenduojamas.\n",
                    "stoneHotCold1":"Akmenys turi gebėjimą iš raumenų pašalinti toksinus, sukauptus dėl streso ir nesveiko gyvenimo būdo.",
                    "stoneHotCold2": "Po masažo jausitės pailsėję ir atgausite jėgas, po kūną pasklis jauki šiluma, grįš fizinė ir emocinė pusiausvyra.\n" +
                    "Nėštumo metu, vėžio ir infekcinių ligų atveju, šis masažas nerekomenduojamas.",

                    "backSpin": "Šis masažas idealiai tinka žmonėms, kurie visą dieną praleidžia, pavyzdžiui: prie kompiuterio ar vairuodami automobilį, dirbantiems sėdimą ar sunkų fizinį darbą įtampa susikaupia stuburo dalyje, kaklo ir pečių, juosmens ir sėdmenų srityse, ir dėl to susiformuoja skausmingi mazgai. Be to, dėl netaisyklingos stuburo padėties dažnai skauda galvą. \n" +
                    "Šis masažas ypač tinka po treniruočių.\n" +
                    "Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros, galvos skausmų, atpalaiduoti įtemptas raumenų grupes.\n",
                    "backSpin2": "Periodiškai atliekamas masažas padės atsikratyti dažnų nugaros ir galvos skausmų, atpalaiduoti įtemptas raumenų grupes. ",
                    "older": "Masažas yra būtina ir labai naudinga procedūra pagyvenusiems žmonėms, pensininkams. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus. Masažas gali padėti žmonėms, kenčiantiems raumenų skausmus ar sergantiems atritu. Kada žmogus kenčia, jis tampa vis mažiau aktyvus, nukenčia gyvenimo kokybė ir sveikata. Masažas gerina kraujotaką, pašalina raumenų nuovargį ir raumenys įgauna tonusą. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė. \n" +
                    "Prieš masažą Jums gerai būtų pasikonsultuoti su savo gydytoju. Kai tik gausite gydytojo leidimą masažui, jus drąsiai galite kreiptis pas mane.",
                    "relaxBody": "Šis masažas tinka visiems, norintiems atsipalaiduoti po sunkios dienos, užsimiršti bei pabėgti nuo kasdienės rutinos.\n" +
                    "Pašalina: įtampą ir stresą, atslūgsta nugaros ir galvos skausmai, atsipalaiduoja raumenys,     \n" +
                    "teigiamai veikia vidinę organizmo būseną, pagerina nuotaiką bei grąžina energiją.\n" +
                    "Vienas ar du šio atpalaiduojančio masažo seansai per savaitę garantuoja Jums gerą darbingumą, puikią nuotaiką ir savijautą.\n",
                    "relaxBody2":"Vienas ar du šio atpalaiduojančio masažo seansai per savaitę garantuoja Jums gerą darbingumą, puikią nuotaiką bei savijautą.",
                    "ajurved": "Masažas atliekamas ne tik norint pagražinti krūtinę, sustangrinti krūtis, suteikti joms gražią formą, bet ir siekiant gilesnių terapinių tikslų.\n" +
                    "Masažas daro teigiamą įtaką visų moters reprodukcinių organų sistemai bei padeda subalansuoti hormonų sistemos veiklą. Pastebimai sumažina nemalonų krūtų jautrumą  susijusį su menstruacijų ciklu. \n" +
                    "Praktiškai išnyksta krūtų vėžio rizika. \n" +
                    "Švelnėja implantų surandėjimai.\n" +
                    " Pagerina savijautą, padaro krūtis gražesnes, suteikia pasitikėjimo ir padeda geriau jaustis kaip moteriai. \n" +
                    "Masažas atliekamas naudojant augalinius aliejus ir trunka iki vienos valandos.\n" +
                    "Reguliarus masažas padeda pašalinti dažnus krūtų skausmus.\n",
                    "antice": "Nugalėkime celiulitą kartu!\n" +
                    "Daugybė moterų ieško būdų kaip nugalėti didžiausią gražių kojų priešą – celiulitą.\n" +
                    "Reklamuojami brangūs produktai ne visuomet būna efektyvūs, ne visuomet stebuklingai pašalina celiulitą. Todėl mokslininkai, tiriantys šią problemą, teigia, kad veiksmingus, gerus rezultatus žadantis gali būti tik kompleksinė terapija: subalansuota mityba + aktyvi fizinė veikla + anticeliulitinis masažas.\n" +
                    "Masažo metu šildoma oda, skatinama medžiagų apykaita, kraujotaka ir limfos apytaka. Probleminėse vietose atliekami specifiniai gilūs judesiai.\n" +
                    "Taigi, šis masažas gerina limfos tekėjimą, šalina iš organizmo šlakus, toksinus bei audiniuose susikaupusius skysčius. Gerina medžiagų apykaitą ląstelėse, aktyvina kraujotaką, atkuria mikrocirkuliaciją, minkština audinius ir gerina raumenų tonusą, ko pasekoje stangrėja oda.\n" +
                    "\n" +
                    "Rekomenduojama 10-15 procedūrų, atliekant jas kas antrą dieną. Po to procedūros atliekamos kelis kartus per mėnesį.\n",
                    "relaxFoot": "Pėdų masažas taikomas pavargusioms, skausmingoms kojoms atpalaiduoti, kūno     gyvybiniam tonusui padidinti bei imunitetui stiprinti. \n" +
                    "Taip pat šis masažas taikomas esant miego sutrikimams, įtampai ir stresui mažinti.\n" +
                    "Ypač tinka moterims ar merginoms, kurios dažnai dėvi aukštakulnius, antsvorį turintiems žmonėms ir nėščiosioms.\n" +
                    "Atliekant reguliariai pėdų masažą pamiršite skausmus !\n" +
                    "Rekomenduojamas 10-12 procedūrų kursas 2-3 k./sav.\n",

                    "sepHead": "Sumažina stresą, galvos skausmus, gerina kraujo apytaką.",
                    "sepNeck": "Efektyviausia nemalonių simptomų šalinimo priemonė. Jau po pirmo karto jus pajusite bendrą savijautos pagerėjimą. Po pilno masažo kurso skausmingi pojūčiai išnyksta, atsiranda žvalumas, padidėja darbingumas, išnyksta nemiga ir irzlumas. Tai yra puiki priemonė atsikratyti galvos, kaklo, pečių skausmo, rankų tirpimo jausmo.",
                    "sepStoma": "Stimuliuoja virškinimą, turi teigiamą poveikį vidinių organų veiklai, gerina virškinimo trakto funkcijas ir tulžies sekreciją, padeda su vidurių užkietėjimais arba dujų susikaupimo žarnyne",


                    "sepPar":"Gerina kraujo ir limfos apytaką juosmens ir kojų srityse, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis. Kojų masažas – atpalaiduoja įtemptus audinius, mažina sąnarių, raumenų, pėdos skausmus, dažniausiai rekomenduojamas po patirtų traumų, operacijų, esant kojų nuovargiui.\n" +
                    " Šis masažas ypač tinka po treniruočių.\n",

                    "collar":"Pečių juosta ir apykaklės zona - tai vietos, kurios jautriausiai reaguoja į stresą ir netaisyklingai sėdimą padėtį. Pečiai ir kaklo zona ypatingai kenčia  dėl šiuolaikinio įpročio nuolat palenkus galvą žiūrėti į kompiuterio ir mobiliuosius ekranus, telefonus, planšetes.\n" +
                    "Apykaklės masažas rekomenduojamas, jei Jus vargina rankų tirpimas, svaigulys, akių,     galvos ar kaklo skausmai. Taip pat  jaučiamas skausmas  sukiojant galvą į vieną ar kitą pusę. Dažniausiai tai vyksta dėl ilgo ir nepatogaus sėdėjimo. \n" +
                    "Dirbantiems sėdimą darbą, ilgą laiką praleidžiantiems prie kompiuterio ar     vairuojant automobilį, nuolat dirbantiems persikreipus tam tikroje pozoje, dirbantiems fizinį darbą, kai patiriami sunkūs fiziniai krūviai. \n" +
                    "Reguliariai atliekant masažo kursus, Jūs pamiršite kūprinimąsi, įgausite karališką laikyseną ir lengvą bei grakščią eiseną.\n" +
                    "\n" +
                    "Atlikite procedūrą kas antrą dieną, o dar geriau - kas 2-3 dienas. Vidutinė norma yra 10 kartų. \n" +
                    "Kartoti 2-3 kartus metuose.\n",
                    "senior":"Masažas yra būtina ir labai naudinga procedūra. Tyrimai parodė, kad masažas lėtina senėjimo procesą. Taip pat masažas veikia raminančiai visą organizmą ir gali sumažinti skausmus, nuo kurių dažnai kenčia pagyvenę žmonės. Mokslininkai įrodė, kad masažas sėkmingai kovoja su šiais pasikeitimais. Pavyzdžiui, tiems, kurie kenčia nuo artrito, masažas sumažina skausmą ir padidina judesių amplitudę sąnariuose ir padeda organizmui gaminti  natūraliai skystį sąnariuose, gerina kraujotaką ir t.t. Masažas pagerina taip pat ir atmintį, o tai labai svarbu pagyvenusiems žmonėms. Dėl to pagerėja pagyvenusio žmogaus gyvenimo kokybė.\n" +
                    "Visi masažo judesiai švelnūs  ir lengvi.\n",

                    "sepWaist": "Gerina kraujo ir limfos apytaką juosmens bei kojų srityse, atpalaiduoja įsitempusius raumenis, mažina juosmens, sėdmenų, kojų skausmą, stiprina nusilpusius raumenis. Sumažina skausmą po operacijos, mažina nervinių šaknų uždegimą.",
                    "stoneHotSpin":""




                },
                "de": {
                    "limphoBody": "Dies ist eine spezielle Ganzkörpermassage, um überschüssige zelluläre Metaboliten, Toxine und Flüssigkeiten aus dem Gewebe zu entfernen. Die Massage eignet sich für alle, die sich ödematös oder oft müde fühlen. Nach einem langen Arbeitstag können müde Beine perfekt entspannt werden und es stellt sich ein Gefühl von Leichtigkeit ein. Die Lymphdrainage vermindert anhaltende chronische Müdigkeit und Kopfschmerzen, Schwellungen nehmen ab und die Hautelastizität verbessert sich. Die gewünschte Wirkung wird nach etwa 15 Behandlungen erreicht. "+
                                  " Aus vorbeugender Sicht verbessert die manuelle Lymphdrainage nach 3 bis 5 Sitzungen (alle zwei Wochen) nachhaltig Ihr Wohlbefinden und Ihr Aussehen.",

                    "limphoBody2": "Die Massage ist schmerzlos und angenehm. In der Regel reichen etwa 10 Sitzungen, um das Lymphsystem wieder Ergebnisse zu machen. Massage Lymphzirkulation wird bis zu 10 Mal aktiviert!",
                    "limphoFace": "Bei konstantem Stress und Müdigkeit sind die Gesichtsmuskeln wie in einer Maske der \"Traurigkeit\" eingefroren. Die manuelle Lymphdrainage ist eine exklusive Prozedur, die in kurzer Zeit unnötige Flüssigkeiten, Schadstoffe und Schwellungen im Gesicht entfernt und dadurch chronische Müdigkeit, Verspannungen, Kopfschmerzen lindern kann. Ausserdem lassen diese Massagen die Haut elastischer, lebendiger und gesünder aussehen und auch Fältchen können geglättet werden. Die gewünschte Wirkung wird nach etwa 15 Behandlungen erreicht." +
                                   "Bei einer vorbeugenden Answendung verbessert die manueller Lymphdrainage nach 3 bis 5 Sitzungen (alle zwei Wochen) Ihr Aussehen und Ihr Wohlbefinden auf lange Sicht.",
                    "stoneHotCold": "Die Steine, die bei dieser Massage eingesetzt werden, wurden an der Küste der Ostsee gesammelt. Über Tausende von Jahren waren sie den Kräften des Meeres ausgesetzt, wurden von Sonne, Luft und Wind geformt und erhielten so ihre einzigartigen Formen und Eigenschaften, die den menschlichen Körper positiv beeinflussen. Die Steine haben die Fähigkeit, Giftstoffe und angestauten Stress abzubauen sowie Anspannungen zu lösen. Sie verbessern den Schlaf, unterstützen den Blutdruck, wirken sich positiv aufs Herz aus und regulieren so die körpereigenen, natürlichen Kräfte. Diese Massage eignet sich deshalb besonders bei Müdigkeit und Stress, da die Wärme der Steine muskelentspannend wirkt. Die Abwechslung mit den kühlen Steinen wirkt sich dabei vitalisierend auf das vegetative Nervensystem aus und entspannt verkrampfte Rücken–, Kopf– und Nackenmuskulatur. Ausserdem ist diese Massage wirksam bei Rücken- und Nackenschmerzen, chronischer Müdigkeit, Migräne, Taubheit der Finger, Erkältung in den Gliedmaßen usw. und hat eine positive Wirkung auf das Nervensystem. Die Anwendung bewirkt physisches und seelisches Gleichgewicht und lässt Sie rundum entspannt fühlen." +
                                     "Bei Schwangerschaft, Infektions– und Krebskrankheiten wird diese Massage nicht empfohlen.",

                    "backSpin": "Die Rückenmassage hilft, den Rücken und insbesondere den Schulter–, Kopf- und Nackenbereich optimal zu entspannen und Blockaden zu lösen. Diese Massage ist ideal für Menschen, die den ganzen Tag im Stehen oder Sitzen verbringen und dadurch häufig unter Rücken-, Kopfschmerzen und Muskelverspannungen leiden. Eine regelmässige Anwendung löst diese Muskelverspannungen und wirkt sich positiv auf Ihre Wirbelsäule aus und steigert das allgemeine körperliche Wohlbefinden.",
                    "backSpin2": "Eine regelmäßige Massage hilft Ihnen dabei, sich zu befreien häufige Rückenschmerzen, Kopfschmerzen, Muskelverspannungen. Nach der Massage fühlen Sie sich entspannt und voller Energie.",
                    "older": "Massage ist ein notwendiges und sehr nützliches Verfahren für ältere Menschen, Rentner. Studien haben gezeigt, dass die Massage den Alterungsprozess verlangsamt. Auch Massage hat eine beruhigende Wirkung im ganzen Körper und kann Schmerzen reduzieren. \n" +
                    "Мassage kann Menschen helfen, die unter Muskelschmerzen leiden: Zum Beispiel, diejenigen, die an Arthritis leiden, Massage hilft, Schmerzen zu reduzieren, erhöht die Amplitude der Bewegung in den Gelenken. Wenn eine Person leidet, wird sie immer weniger aktiv und beeinflusst die Lebensqualität und Gesundheit. Massage verbessert die Durchblutung, beseitigt Muskelermüdung und Muskeln erhalten Ton. Dies verbessert die Lebensqualität einer älteren Person. \n" +
                    "Vor einer Massage ist es ratsam, einen Arzt zu konsultieren. Sobald Sie die Erlaubnis vom Arzt für eine Massage bekommen, können Sie sich mit mir in Verbindung setzen.",
                    "relaxBody": "Eine Entspannungsmassage eignet sich für alle, die sich nach einem anstrengenden Tag erholen und dem Alltag entfliehen möchten. Sie entspannt die Muskeln, hilft bei Rücken- und Kopfschmerzen, wirkt sich positiv auf den inneren Zustand des Organismus aus und fördert Stimmung und Energie. Es wird bei jeder Massage individuell auf Ihre momentanen Beschwerden und Spannungen eingegangen. Die regelmässige Anwendung dieser entspannenden Massage garantieren Ihnen ein gutes Arbeitsleben, allgemeines Wohlbefinden und deutlich mehr Kraft und Leistungsfähigkeit.",
                    "relaxBody2":"Eine oder zwei diese entspannende Massage pro Woche garantieren Ihnen ein gutes Arbeitsleben, gute Laune und Wohlbefinden.",
                    "ajurved": "Diese wohltuende, etwas einstündige Brust-Massage sorgt für eine straffere Haut und ein straffes Bindegewebe, verhindert Verspannungen und Entzündungen im Brustbereich, beugt Zystenbildung vor und aktiviert das Herz und sein Chakra. Diese stimulierende Anwendung wirkt sich optimal auf die Harmonisierung des weiblichen Hormonzyklus aus. Die Verwendung von feinsten Planzenölen fördert ein harmonisches und lebensbejahendes Wohlgefühl.",
                    "antice": "Gemeinsam Cellulite bekämpfen! Viele Frauen suchen nach Wegen, um den größten Feind der schönen Beine zu besiegen - Cellulite. Auch teure Produkte entfernen Cellulite nicht immer auf magische Weise. Wissenschaftler, die dieses Problem untersuchen, empfehlen, dass nur eine komplexe Therapie aus ausgewogener Ernährung, aktiver körperlicher Aktivität und Anti-Cellulite Massage gute Ergebnisse versprechen. Während der Massage erwärmt sich die Haut, der Stoffwechsel, die Durchblutung, und der Lymphfluss wird angeregt. In Problembereichen werden bestimmte tiefe Bewegungen ausgeführt. Diese fördern die Ausschwemmung von Schlackstoffen. Als Resultat werden die Verklebungen gelöst und das Bindegewebe gestrafft. Bei regelmässiger Anwendung, empfohlen sind 10 bis 15 Massagen im Zweitagesrythmus, sieht die Haut dauerhaft ebenmäßiger aus und das Bindegewebe erhält eine flexible, weiche und gesunde Struktur.",
                    "relaxFoot": "Diese Anwendung hilft, müde, schmerzende Beine und Füsse zu entspannen, verbessert die Vitalität Ihres Körpers und stärkt auch das Immunsystem. Ausserdem wird diese Massage bei Schlafstörungen, Verspannungen und Stress angewendet. Besonders geeignet ist sie für Frauen, die oft High Heels tragen, übergewichtige Menschen und schwangere Frauen. Bei einer regelmäßigen Anwendung werden Sie Ihre Beschwerden und Schmerzen in den Füssen und Beinen rasch vergessen! Empfohlen sind 10-12 Behandlungen, bei zwei- bis drei Massagen pro Woche.",

                    "sepHead": "Entspannt bei Stress, lindert Krämpfe, verbessert den Blutkreislauf.",
                    "sepNeck": "Die effektivste Behandlung, sowie ein Heilmittel für die Beseitigung von unangenehmen Symptomen. Nach der ersten Massage des Halses, fühlen Sie eine allgemeine Verbesserung in Ihrem Gesundheitszustand. Nach einem vollen Massagen verschwinden schmerzhafte Empfindungen, die Arbeitskapazität steigt, Schlaflosigkeit und Reizbarkeit verschwinden. Nackenmassage ist ein ausgezeichnetes Werkzeug, um Kopfschmerzen loszuwerden. \n" +
                    "Dies ist eine hervorragende Maßnahme zur Reduzierung von Kopf, Hals, Schulter Schmerzen, Taubheit Hände.",
                    "sepStoma": "Regt die Verdauung an, wirkt sich positiv auf die intra–abdominalen Organe aus, verbessert Magen– und Darmfunktionen sowie die Gallensekretion, hilft bei Verstopfung oder Gasansammlung im Darm.",
                    "sepPar":"Diese Massage verbessert die Blut- und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt und stärkt verkrampfte Muskeln, lindert Gesäßschmerzen und hilft dadurch auch bei Gelenk- und Beinschmerzen. Sie wird in der Regel nach einem Trauma, chirurgischen Eingriffen oder bei chronischer Müdigkeit empfohlen. Diese Massage eignet sich insbesondere auch nach einem intensiven Training.",
                    "collar":"Kopfschmerzen und Schmerzen im Nackenbereich werden oft durch schlechte Haltung, viel Sitzen, Schlafstörungen und Bewegungsarmut hervorgerufen. Eine gezielte Massage des Nackens und oberen Rückenbereichs verbessert die Elastizität der Muskelfasern, die Durchblutung und dadurch auch den Sauerstoffzufuhr zum Gehirn. Diese Massage ist für Patienten aller Altersgruppen geeignet. Bei regelmässiger Anwendung, empfohlen sind etwa 10 Massagen alle zwei bis drei Tage, kann die Nacken- und Rückenmuskulatur massgeblich gelockert werden. Wiederholen Sie dies zwei bis dreimal pro Jahr, um eine vorbeugende Wirkung zu erzielen.",
                    "senior":"Je älter ein Mensch wird, desto mehr verliert sein Körper an Elastizität, Beweglichkeit, Kraft und Stabilität. Dies sind die üblichen Zeichen des Alterns. Ältere Manschen leiden oft an schmerzhaften Verspannungen. Sanfte Massagen oder Teil-Massagen können bei solchen Verspannungen und Blockaden sehr wohltuend sein. Sie wirken entspannend und beruhigend und fördern den Bewegungsbereich und dadurch auch die Lebensqualität. Die Behandlung von älteren Personen wird nur sanft, schonend und einfühlsam vollzogen, da der Körper im Alter viel empfindlicher reagiert.",
                    "sepWaist": "Verbessert die Blut– und Lymphzirkulation im unteren Rücken und in den Beinen, entspannt enge Muskeln, Gesäß, Beinschmerzen, stärkt die geschwächten Muskeln. Verringert den Schmerz nach der Operation, reduziert die Entzündung der Nervenwurzeln.",
                    "stoneHotSpin":""


                },
                "ru": {
                    "limphoBody": "Это специальный массаж всего тела для удаления избыточных клеточных метаболитов, токсинов и жидкостей из тканей. Массаж подходит всем, кто чувствует отечность ног или просто усталость. После долгого рабочего дня он прекрасно расслабляет тело, уставшие ноги и дает ощущение легкости. После лимфодренажа исчезает устойчивая хроническая усталость и головные боли, уменьшается отечность конечностей - лимфедема (отек лимфы), улучшается эластичность кожи." +
                    "Желаемый эффект достигается примерно после 15 процедур." +
                    " С профилактической точки зрения: от 3 до 5 сеансов ручного лимфодренажа (один раз в две недели) улучшают вашу внешность и хорошее самочувствие в течение длительного времени." +
                    " Лимфодренажный массаж тела проводится как для женщин, так и для мужчин.",
                    "limphoBody2": "Массаж безболезненный, приятный, и обычно достаточно около 10 сеансов, чтобы восстановить лимфатическую систему до видимых результатов. Массаж активизирует циркуляцию лимфы до 10 раз!",
                    "limphoFace": "В случае постоянного стресса и усталости, мышцы лица замораживаются в маске «грусти».\n" +
                    "Ручной лимфодренаж - эксклюзивная процедура.\n" +
                    "Позволит за короткий срок: вывести лишнюю жидкость, шлаки, снять отёки и     одутловатость лица. Cнять хроническую усталость, напряжение,     подавленность, головные боли, зарядить     организм энергией.     \n" +
                    "Улучшить цвет лица и состояние кожи: снимая малейшие мышечные напряжения, лимфодренаж улучшает кровообращение, получая полноценное питание, кожа выглядит более эластичной, свежей и здоровой, разглаживаются морщины.\n" +
                    "Лимфодренаж лица обеспечивает отличные результаты при: отеки лица, сухости кожи, раннем старении, темных кругах и мешках под глазами, снижение эластичности тканей, борьбе с купоросом.\n" +
                    "\n" +
                    "Желаемый эффект достигается примерно после 15 процедур.\n" +
                    "С профилактической точки зрения: от 3 до 5 сеансов ручного лимфодренажа (один раз в две недели) улучшают вашу внешность и хорошее самочувствие в течение длительного времени. \n" +
                    "Лимфодренажный массаж лица проводится как женщинам, так и мужчинам.\n",
                    "stoneHotCold": "Камни, используемые в массаже, собранных на побережье Балтийского моря. Они растут на протяжении тысяч лет на морском дне обогащает огромную силу и солоноватой воды нити в сочетании с солнечным светом колебания приобретают уникальные характеристики, которые влияют на организм человека. Камень имеет способность из мышц удалить токсины, накопленные в результате стресса и нездорового образа жизни.\n" +
                    "А также улучшает сон, положительно влияет на частоту сердечных сокращений.\n" +
                    "Массаж эффективен при боли в спине и шее, положительно влияет на нервную систему, хронической усталости, мигрени, онемение пальцев, ощущение холода в конечностях и т. д.\n" +
                    "После массажа вы будете чувствовать себя отдохнувшими и восстановится силы по телу распространяется тепло возвратится физический и эмоциональный баланс.\n" +
                    "Во время беременности, рака и инфекционных заболеваний, этот массаж не рекомендуется.\n",
                    "stoneHotCold1": "Камень имеет способность из мышц удалить токсины, накопленные в результате стресса и нездорового образа жизни.",
                    "stoneHotCold2": "После массажа вы будете чувствовать себя отдохнувшими и восстановится силы по телу распространится тепло возвратится физический и эмоциональный баланс.\n" +
                    "Во время беременности, рака и инфекционных заболеваний, этот массаж не рекомендуется.",
                    "backSpin": "Этот массаж идеально подходит для людей, которые проводят весь день стоя или сидя, например: за компьютером или за рулем автомобиля, а также тяжело физически работая, когда все напряжение сосредоточено в позвоночнике, шее и плечах, поясе и ягодицах, вызывая болезненные ощущения в мышцах. \n" +
                    "Этот массаж особенно подходит после тренировки. \n" +
                    "Кроме того, неправильное положение позвоночника часто вызывает головную боль. \n" +
                    "\n" +
                    "\n" +
                    "Периодически делая  массаж поможет вам избавиться от частых болей в спине, головных болей, расслабить напряженные группы мышц. После массажа вы почувствуете себя расслабленным и энергичным.\n",
                    "backSpin2": "Периодический массаж поможет вам избавиться от частых болей в спине, головных болей, расслабить напряженные группы мышц. После массажа вы почувствуете себя расслабленным и энергичным.",
                    "older": "Массаж – необходимая и очень полезная процедура для пожилых людей, пенсионеров. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль. Массаж может помочь людям, страдающим от мышечных болей : Например, те кто страдает от артрита, массаж помогает уменьшить боль, увеличивает амплитуду движения в суставах. Когда человек страдает, он становится все менее и менее активным, влияющий на качество жизни и здоровье. Массаж улучшает кровообращение, устраняет мышечную усталость, а мышцы получают тонус. Это улучшает качество жизни пожилого человека. \n" +
                    "Перед массажем необходимо проконсультироваться с врачом. Как только вы получите разрешение врача на массаж, вы можете спокойно связаться со мной.",
                    "relaxBody": "Расслабляющий массаж подойдет всем, кто хочет расслабиться после тяжелого дня, забыть и уйти от повседневной рутины.\n" +
                    "Удаляет: напряжение и стресс, боли в спине и голове, расслабляет мышцы, оказывает положительное влияние на внутреннее состояние организма,\n" +
                    "улучшает настроение и энергию.\n" +
                    "\n" +
                    "Один или два расслабляющих массажных сеансов в неделю обеспечат вам хорошую работоспособность, отличное настроение и хорошее самочувствие.\n",
                    "relaxBody2":"Один или два расслабляющих массажных сеансов в неделю обеспечат вам хорошую работоспособнось, отличное настроение и хорошее самочувствие.",
                    "ajurved": "Этот массаж положительно влияет на репродуктивную систему у женщин и помогает сбалансировать гормональную систему.\n" +
                    "Уменьшает и предотвращает: очень уменьшает неприятную болезненность молочной железы, связанное с менструальным циклом,  предотвращает боль в груди,  напряжения и воспаления в области груди,  предотвращает образование кист и рак молочной железы,  активирует сердце и сердечную чакру.\n" +
                    "Этот массаж улучшает самочувствие, делая вашу грудь более красивой, дает вам уверенность в себе и помогает вам чувствовать себя лучше, как женщине.\n" +
                    "Массаж выполняется с применением растительных масел и длится до одного часа.\n" +
                    "Регулярный массаж помогает у женщин устранить частые боли в грудях.\n",
                    "antice": "Давайте победим целлюлит вместе!\n" +
                    "Многие женщины ищут способы, чтобы победить величайший враг красивых ног - целлюлит.\n" +
                    "Продвигаемые дорогие продукты не всегда эффективны, они не всегда удаляют целлюлит волшебным образом. Поэтому ученые, исследующие эту проблему, утверждают, что только комплексная терапия: сбалансированное питание + активная физическая активность + антицеллюлитный массаж могут быть эффективными, обещая хорошие результаты.\n" +
                    "Во время массажа кожа прогревается, стимулируется обмен веществ, кровообращение, циркуляция лимфы. Определенные глубокие движения выполняются в проблемных зонах.\n" +
                    "Таким образом, этот массаж улучшает лимфоток;\n" +
                    "устраняет шлаки, токсины, жидкость скопившуюся в тканях организма. Улучшает клеточный метаболизм, активизирует кровообращение, восстанавливает микроциркуляцию, смягчает ткани, улучшает мышечный тонус, укрепляет кожу.\n",
                    "relaxFoot": "Массаж применяется чтобы расслабить усталые, болезненные ноги,\n" +
                    " повысить жизненный тонус организма, укрепить иммунитет.\n" +
                    "Кроме того, этот массаж применяется при  нарушении сна, уменьшить напряжение и стресс.\n" +
                    "Особенно подходит для  женщин или девушек, которые часто носят высокие каблуки,  людям с избыточным весом, беременным женщинам.\n" +
                    "При регулярном массаже стоп (+голень) вы забудете о своих неприятностях и болях!\n" +
                    "Рекомендуется 10-12 процедур, курсом 2-3 раза в неделю.\n",

                    "sepHead": "Уменьшает стресс, головные боли, улучшает кровообращение.",
                    "sepNeck": "Наиболее эффективное средство для устранения неприятных симптомов. Уже после первого раза вы почувствуете улучшение общего состояния. После полного курса массажа исчезают болезненные ощущения, поевляетса бодрость, возрастает работоспособность, исчезает бессонница и раздражительность. Это отличный способ избавиться от боли в голове, шее, плечах и онемение рук.",
                    "sepStoma": "Стимулирует пищеварение, оказывает положительное влияние на внутрибрюшные органы, улучшает функции желудка и кишечника, а также секрецию желчи, помогает при запоре или накоплении газа в кишечнике.",

                    "sepPar":"Улучшает циркуляцию крови и лимфы в пояснице и ногах, уменьшает  поясничные, ягодицы и в ногах боли, укрепляет ослабленные мышцы.Этот массаж - расслабляет напряженные ткани, снимает боли в суставах, мышцах ног, обычно рекомендуется после травм, операций, усталости ног.\n" +
                    "Этот массаж особенно подходит после тренировки.\n",
                    "collar":"Люди, которые подвержены длительному пребыванию с наклоненной вперед головой, сразу же попадают в группу риска. Сюда можно зачислить все сидячие профессии, особенно программисты, бухгалтера, водители.\n" +
                    "А также люди, которые особенно страдают из-за постоянной привычки постоянно смотреть на компьютер и мобильные экраны, телефоны, планшеты, наклонив голову. Наверное, многие представители сталкиваются с проблемами головных болей, частой усталости болью в области надплечий плечелопаточным болевым синдромом.     \n" +
                    "Многие, запасаясь терпением учатся жить с этими болями, периодически испытывая сильные боли в период острой стадии.\n" +
                    "Регулярно проходя курс массажа, поможет вам избавиться от болей в шейно-воротниковой зоне.\n" +
                    "\n" +
                    "Делайте процедуру через день, а еще лучше - через 2-3 дня. Средний курс составляет 10 раз.\n" +
                    "           Повторить 2-3 раза в год.",
                    "senior":"Массаж является необходимой и очень полезной процедурой. Исследования показали, что массаж замедляет процесс старения. Также массаж оказывает успокаивающее действие по всему телу и может уменьшить боль, которая часто страдает  пожилые люди. Ученые доказали, что массаж успешно борется с этими изменениями. Например, для тех, кто страдает от артрита, массаж уменьшает боль и увеличивает амплитуду движений в суставах и помогает организму вырабатывать естественную жидкость в суставах, улучшает кровообращение и так далее. Массаж также улучшает память и качество жизни, что очень важно для пожилых людей.\n" +
                    "Все массажные движения нежные и легкие.\n",
                    "sepWaist": "Улучшает циркуляцию крови и лимфы в пояснице и ногах, расслабляет напряженные мышцы, уменьшает поясничные, ягодицы, ногах боль, укрепляет ослабленные мышцы. Уменьшает боль после операции, уменьшает воспаление нервных корешков.",
                    "stoneHotSpin":""


                }
            };
        },
        getPrices: function () {
            return {
                "lt": {
                    "title": "Kainos",
                    "length":"Trukmė",
                    "spaTitle": ["Masažai", "30min", "60min", "90min","120min"],
                    "spaTitle2":["","","","","","la"],
                    "limphoBody": ["Limfodrenažinis kūno masažas", "–", "–","150 CHF", "–","-", "10%/13%"],
                    "limphoFace": ["Limfodrenažinis veido masažas", "100 CHF", "–", "–"],
                    "stoneHotCold": ["Karštų – šaltų akmenų masažas", "–", "–", "220 CHF"],
                    "backSpin": ["Klasikinis – segmentinis nugaros masažas", "100 CHF", "150 CHF", "–"],
                    // "older": ["Masažas vyresnio amžiaus žmonėms"],
                    "relaxBody": ["Atpalaiduojantis viso kūno masažas", "–", "–", "200 CHF"],
                    "ajurved": ["Ajurvedinis krūtų masažas moterims", "100 CHF", "–", "–"],
                    // "antice": ["Anticeliulitinis masažas rankomis"],
                    "relaxFoot": ["Atpalaiduojantis pėdų–blauzdų masažas", "100 CHF", "–", "–"],
                    "anticel": ["Anticeliulitiniai masažai", "–", "130 CHF", "180 CHF"],
                    "antiSed": ["Sėdmenų masažas", "–", "130", "180"],
                    "antiTig": ["Šlaunų masažas", "–", "130", "180"],
                    "antiSto": ["Pilvo masažas", "70", "130", "180"],
                    "antiTro": ["Žąsto masažas", "–", "130", "180"],
                    // "sepPar": ["Atskirų kūno dalių masažai", "30min", "60min", "90min"],
                    "sepPar": ["Atskirų kūno dalių masažai", "50 CHF", "100 CHF", "150 CHF"],

                    "waist": ["Juosmens, sėdmenų, kojų masažas", "50", "100", "–"],
                    "neck": ["Pečių, kaklo, rankų masažas", "50", "100", "–"],
                    "head": ["Galvos masažas", "50", "–", "–"],
                    "stoma": ["Pilvo masažas", "50", "–", "–"],
                    "kidsMas": ["Vaikams (12–15m)", "60min", "90min", "120min"],
                    "kidBackSpin": ["Klasikinis segmentinis nugaros masažas", "80", "120", "–"],
                    "kidsNeck": ["Pečių, kaklo, rankų masažas", "80", "–", "–"],
                    "kidsWaist": ["Juosmens, sėdmenų, kojų masažas", "80", "–", "–"],
                    "kidsFull": ["Viso kūno masažas", "–", "–", "160"],
                    "otherTitle": ["Kiti masažai", "30min", "60min", "75min","90min"],
                    "offers1":"PASIŪLYMAI",
                    "offers2":["Senjorams suteikiama 15% nuolaida nuo kainos.","Pirkdami 10-ies kartų abonementą, nemokamai gausite 11-ąjį masažą!"],
                    "present1":"DOVANŲ KUPONAI",
                    "present2":["Masažo kuponas yra ideali dovana gimtadieniui, vestuvėms, Kalėdoms ar kitoms progoms.","Dovanų kuponus galima užsisakyti šiuo adresu: Schaffhausen, Oberstadt 22, 1. Stock, telefonu arba info@vidamassage.ch"],
                    "attention1":"ATKREIPKITE DĖMESĮ",
                    "attention2":["Mokėjimas tik grynaisiais (atsiprašome už laikinus nepatogumus).","Paslauga mokama kiekvieno masažo pabaigoje.","Nuolaidos nesumuojamos.","Jei negalite atvykti į masažą. Prašome atšaukti savo užsakymą prieš 24 valandas iki sutartos datos elektroniniu paštu arba sms žinute."]



                },
                "de": {
                    "title": "Preise",
                    "length":"DAUER",
                    "spaTitle": ["Massagen", "30min", "60min", "90min","120min"],
                    "limphoBody": ["Manuelle Lymphdrainage", "–", "140 CHF", "–"],
                    "limphoFace": ["Manuelle Lymphdrainage Gesicht", "100 CHF", "–", "–"],
                    "stoneHotCold": ["Heiß–kalt Steinmassage", "–", "–", "220 CHF"],
                    "backSpin": ["Rücken Massage", "100 CHF", "150 CHF", "–"],
                    // "older": ["Massage für ältere Menscher"],
                    "relaxBody": ["Entspannende Ganzkörpermassagе", "–", "–", "200 CHF"],
                    "ajurved": ["Ayurvedische Brüstmassage für Frauen", "100 CHF", "–", "–"],
                    // "antice": ["Anti–Cellulite massage"],
                    "relaxFoot": ["Entspannende Füße – Waden massage", "100 CHF", "–", "–"],
                    "anticel": ["Anti–Cellulite–Massagen", "–", "130 CHF", "180 CHF"],
                    "antiSed": ["Gesäß", "–", "130", "180"],
                    "antiTig": ["Die Oberschenkel", "–", "130", "180"],
                    "antiSto": ["Bauch", "70", "130", "180"],
                    "antiTro": ["Oberarmmassage", "–", "130", "180"],
                    // "sepPar": ["Teilkörpermassage", "30min", "60min", "90min"],
                    "sepPar": ["Teilkörpermassage", "50 CHF", "100 CHF", "150 CHF"],
                    "waist": ["Massage Schulter–Hals–Hände", "50", "100", "–"],
                    "neck": ["Lendenwirbel – Gesäß – und Beinmassage", "50", "100", "–"],
                    "head": ["Kopfmassage", "50", "–", "–"],
                    "stoma": ["Bauchmassage", "50", "–", "–"],
                    "kidsMas": ["Für kinder ab 12 bis 15 jahren", "60min", "90min", "120min"],
                    "kidBackSpin": ["Rückenmassage", "80", "120", "–"],
                    "kidsNeck": ["Massage Schulter–Hals–Hände", "80", "–", "–"],
                    "kidsWaist": ["Lendenwirbel – Gesäß – und Beinmassage", "80", "–", "–"],
                    "kidsFull": ["Ganzkörpermassagе", "–", "–", "160"],
                    "otherTitle": ["Teilkörpermassagen", "30min", "60min", "75min","90min"],
                    "offers1":"ANGEBOTE",
                    "offers2":["Senioren erhalten 15% Rabatt auf den Preis.","Beim Kauf eines 10-er Abos erhalten Sie die 11. Massage gratis!"],
                    "present1":"GUTSCHEINE",
                    "present2":["Massagegutschein ist die ideale Geschenkidee zum Geburtstag, zur Hochzeit, zu Weihnachten oder zu jeder anderen Gelegenheit.","Geschenkgutscheine können unter der Adresse: Oberstadt 22, 1. Stock, auch telefonisch unter +41797897010 oder info@vidamassage.ch bestellt werden."],
                    "attention1":"BITTE BEACHTEN SIE DEN ANHANG",
                    "attention2":["Zahlung nur in bar (Entschuldigung für vorübergehende Unannehmlichkeiten).","Der Dienst ist am Ende jeder Massage zu bezahlen.","Rabatte addieren sich nicht.","Wenn Sie nicht für eine Massage kommen können. Bitte stornieren Sie Ihre Bestellung bis 24 Stunden vor dem vereinbarten Termin per E-Mail/SMS."]
                },
                "ru": {
                    "title": "Цены",
                    "length":"ВРЕМЯ",
                    "spaTitle": ["Mассажы", "30мин", "60мин", "90мин","120мин"],
                    "limphoBody": ["Лимфодренажный массаж тела", "–", "140 CHF", "–"],
                    "limphoFace": ["Лимфодренажный массаж лица", "100 CHF", "–", "–"],
                    "stoneHotCold": ["Горячих – холодных камней массаж", "–", "–", "220 CHF"],
                    "backSpin": ["Классический – Сегментный массаж спины", "100 CHF", "150 CHF", "–"],
                    // "older": ["Массаж для пожилых людей"],
                    "relaxBody": ["Расслабляющий массаж всего тела", "–", "–", "200 CHF"],
                    "ajurved": ["Аюрведический массаж грудей", "100 CHF", "–", "–"],
                    // "antice": ["Антицеллюлитный массаж"],
                    "relaxFoot": ["Расслабляющий массаж стоп–голень", "100 CHF", "–", "–"],
                    "anticel": ["Антицеллюлитные массажы", "–", "130 CHF", "180 CHF"],
                    "antiSed": ["Ягодицы", "–", "130", "180"],
                    "antiTig": ["Бедры", "–", "130", "180"],
                    "antiSto": ["Живота", "70", "130", "180"],
                    "antiTro": ["Массаж Предплечье", "–", "130", "180"],
                    // "sepPar": ["Массаж отдельнных частей тело", "30min", "60min", "90min"],
                    "sepPar": ["Массаж отдельнных частей тело", "50 CHF", "100 CHF", "150 CHF"],
                    "waist": ["Поясницы– Ягодицы – Ног массаж", "50", "100", "–"],
                    "neck": ["Плечо – шеи – рук массаж", "50", "100", "–"],
                    "head": ["Galvos masažas", "50", "–", "–"],
                    "stoma": ["Pilvo masažas", "50", "–", "–"],
                    "kidsMas": ["Для детей от 12 до 15 лет", "60min", "90min", "120min"],
                    "kidBackSpin": ["Классический – Сегментный массаж спины", "80", "120", "–"],
                    "kidsNeck": ["Плечо – шеи – рук массаж", "80", "–", "–"],
                    "kidsWaist": ["Поясницы– Ягодицы – Ног массаж", "80", "–", "–"],
                    "kidsFull": ["Массаж всего тела", "–", "–", "160"],
                    "otherTitle": ["Другие массажи", "30мин", "60мин", "75мин","90мин"],
                    "offers1":"ПРЕДЛОЖЕНИЯ",
                    "offers2":["Пожилые люди получают 15% скидку от цены.","Купите 10-х абонемент и получите 11 массаж бесплатно!"],
                    "present1":"ПОДАРОЧНЫЕ КУПОНЫ",
                    "present2":["Массажный подарочный купон - идеальный подарок на день рождения, свадьбу, Рождество или другое событие.","Подарочные купоны можно заказать по aдресу: Schaffhausen, Oberstadt 22, 1. Stock,  также по телефону: +41797897010 или info@vidamassage.ch"],
                    "attention1":"ОБРАТИТЕ ВНИМАНИЕ",
                    "attention2":["Оплата только наличными (извините за временные неудобства).","Услуга оплачивается в конце каждого массажа.","Скидки не складываются.","Если вы не можете прийти на массаж. Пожалуйста, отмените ваш заказ по электронной почте или смс за 24 часа до согласованной даты."]
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
                    "title2": "Nustebinkite savo šeimą ar draugus dovanų kortele!",
                    "summary":"Jūsų",
                    "price":"Kaina",
                    "choice":"pasirinkimas"

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
                    "title": "Reservation Sie eine Massage nach Ihren Wünschen!",
                    "title2": "Überraschen Sie Ihre Familie oder Freunde mit einem Geschenkgutschein!",
                    "summary":"Ihre",
                    "price":"Preis",
                    "choice":"wahl"

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
                    "title": "Зaкажите свой массаж в удобное для вас время!",
                    "title2": "Удивите свою семью или друзей подарочной картой!",
                    "summary":"Ваш",
                    "price":"Цена",
                    "choice":"выбор"

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
                    "captcha": "Bestätigen Sie, dass Sie sind kein Roboter"


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
                    "captcha": "Подтвердите, что вы не робот"


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
                    "contacts": "Mūsų kontaktai",
                    "location":"Vieta",
                    "open":"Darbo laikas",
                    "openHours":["Pi: 10:00 - 21:00","An: Uždaryta","Tr: 15:00 - 21:00","Ke: 15:00 - 21:00","Pe: 10:00 - 21:00","Še: 10:00 - 21:00","Se: Uždaryta"],
                    "privacyPolicy":"Aš sutinku su privatumo politika",
                    "privacyPolicy2":"Privatumo politika",
                    "review":"Papasakokite, ką manote apie paslaugas!"


                },
                "de": {
                    "secTitle": "Kontaktieren Sie uns",
                    "sentence": "Haben Sie Fragen? Fragen Sie und wir werden antworten. Sie können uns auch in sozialen Netzwerken folgen.",
                    "title": "Fragen",
                    "name": "Name",
                    "namePH": "Geben Sie einen Namen ein",
                    "email": "E–Mail",
                    "emailPH": "E–Mail eingeben",
                    "question": "Frage",
                    "questionPH": "Deine Frage",
                    "button": "Senden",
                    "socNet": "Unsere sozialen Netzwerke",
                    "contacts": "Unsere Kontakte",
                    "location":"Lage",
                    "open":"Öffnungszeiten",
                    "openHours":["Mo: 10:00 - 21:00","Di: Geschlossen","Mi: 15:00 - 21:00","Do: 15:00 - 21:00","Fr: 10:00 - 21:00","Sa: 10:00 - 21:00","So: Geschlossen"],
                    "privacyPolicy":"Ich stimme den Datenschutzbestimmungen zu",
                    "privacyPolicy2":"Datenschutz-Bestimmungen",
                    "review":"Sagen Sie uns, was Sie über die Dienstleistungen denken!"



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
                    "contacts": "Наши контакты",
                    "location":"Место",
                    "open":"Часы работы",
                    "openHours":["По: 10:00 - 21:00","Вт: Закрыто","Ср: 15:00 - 21:00","Че: 15:00 - 21:00","Пя: 10:00 - 21:00","Су: 10:00 - 21:00","Во: Закрыто"],
                    "privacyPolicy":"Я согласен с политикой конфиденциальности",
                    "privacyPolicy2":"политика конфиденциальности",
                    "review":"Расскажите нам, что вы думаете об услугах!"



                }
            }
        },
        getContactFormErrors: function () {
            return {
                "lt": {
                    "nameLength": "Vardas turi būti tarp 2 ir 100 simbolių",
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
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
                        ["Limfodrenažinis kūno masažas", "0"], ["Limfodrenažinis veido masažas", "1"], ["Karštų – šaltų akmenų masažas", "2"], ["Klasikinis – segmentinis nugaros masažas", "3"], ["Atpalaiduojantis viso kūno masažas", "4"], ["Ajurvedinis krūtų masažas moterims", "5"], ["Atpalaiduojantis pėdų – blauzdų masažas", "6"], ["Anticeliulitiniai masažai", "7"], ["Atskirų kūno dalių masažai", "8"]]

                },
                "de": {
                    "limphoBody": [
                        ["Manuelle Lymphdrainage", "0"], ["Manuelle Lymphdrainage Gesicht", "1"], ["Heiß – kalt Steinmassage", "2"], ["Rücken Massage", "3"], ["Entspannende Ganzkörpermassagе", "4"], ["Ayurvedische Brüstmassage für Frauen", "5"], ["Entspannende Füße – Waden massage", "6"], ["Anti – Cellulite massage", "7"], ["Teilkörpermassage", "8"]]

                },
                "ru": {
                    "limphoBody": [
                        ["Лимфодренажный массаж тела", "0"], ["Лимфодренажный массаж лица", "1"], ["Горячих – холодных камней массаж", "2"], ["Классический – Сегментный массаж спины", "3"], ["Расслабляющий массаж всего тела", "4"], ["Аюрведический массаж грудей", "5"], ["Расслабляющий массаж стоп – голень", "6"], ["Антицеллюлитные массажы", "7"], ["Массаж отдельнных частей тело", "8"]]

                }
            }
        },

        getFFBEErrorMessages: function () {
            return {
                "lt": {
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "nameLength": "Vardo ilgis turi būti nuo 2 iki 50 simbolių",
                    "surnameFormat": "Pavardė negali turėti skaičių bei specialių simbolių",
                    "surnameLength": "Pavardės ilgis turi būti tarp nuo 2 iki 50 simbolių",
                    "emailFormat": "Neteisingas elektroninio pašto adreso formatas",
                    "emailLength": "Elektroninio pašto adresas negali būti tuščias arba ilgesnis nei 100 simbolių",
                    "phoneFormat": "Neteisingai įvestas telefono numeris",
                    "phoneLength": "Telefono numeris turi būti nuo 9 iki 20 simbolių",
                    //fix
                    "massageFormat": "",
                    "massageLength": "Pasirinkite masažą",
                    "massageOptionFormat": "Pirmiausia pasirinkite masažą",
                    "massageOptionLength": "Pasirinkite masažo variantą",
                    "dateFormat": "Pasirinkite kitą datą",
                    "dateLength": "Pasirinkite datą",
                    "timeFormat": "Pirmiausia pasirinkite datą",
                    "timeLength": "Pasirinkite laiką",
                    "messageLength": "Žinutė negali viršyti 1000 simbolių",
                    "messageFormat": "Prašome nenaudoti tokių simbolių kaip '<>`'",
                    "captchaFormat": "Patvirtinkite, kad esate ne robotas",
                    "slots": "Atsiprašome, bet pasirinktai datai vietų nebėra. Pasirinkite kitą datą",
                    "timeFormat3":"Norėdami pamatyti galimus laikus, pirmiausia pasirinkite masažą, trukmę bei datą.",
                    "timeFormat4":"Jūsų pasirinktai datai neliko laisvų vietų. Prašome pasirinkti kitą datą."
                },
                "de": {
                    "nameFormat": "Der Name darf keine Zahlen und Sonderzeichen enthalten",
                    "nameLength": "Die Länge des Namens muss zwischen 2 und 50 Zeichen betragen",
                    "surnameFormat": "Der Nachname darf keine Zahlen und Sonderzeichen enthalten",
                    "surnameLength": "Der Nachname muss zwischen 2 und 50 Zeichen lang sein",
                    "emailFormat": "Ungültiges E-Mail-Adressformat",
                    "emailLength": "Die E-Mail-Adresse darf nicht leer oder länger als 100 Zeichen sein",
                    "phoneFormat": "Ungültige Telefonnummer",
                    "phoneLength": "Die Telefonnummer muss zwischen 9 und 20 Zeichen lang sein",
                    //fix this, removed now "xxx"
                    "massageFormat": "",
                    "massageLength": "Wählen Sie eine Massage",
                    "massageOptionFormat": "Wählen Sie zuerst eine Massage",
                    "massageOptionLength": "Wählen Sie eine Massageoption",
                    "dateFormat": "Wählen Sie ein anderes Datum",
                    "dateLength": "Wählen Sie ein Datum aus",
                    "timeFormat": "Wählen Sie zuerst ein Datum aus",
                    "timeLength": "Wähle eine Zeit aus",
                    "messageLength": "Die Nachricht darf nicht länger als 1000 Zeichen sein",
                    "messageFormat": "Bitte verwenden Sie nicht die folgenden Symbole '<>`'",
                    "captchaFormat": "Bestätigen Sie, dass Sie kein Roboter sind",
                    "slots": "Entschuldigung, aber für das ausgewählte Datum sind keine weiteren Standorte verfügbar. Wählen Sie ein anderes Datum",
                    "timeFormat3":"Um die verfügbare Zeit anzuzeigen, wählen Sie zuerst die Massage, die Dauer und das Datum aus.",
                    "timeFormat4":"Zum Datum Ihrer Wahl sind keine Stellen zu besetzen. Bitte wählen Sie ein anderes Datum."

                },
                "ru": {
                    "nameFormat": "Имя не может содержать числа и специальные символы",
                    "nameLength": "Длина имени должна быть от 2 до 50 символов",
                    "surnameFormat": "Фамилия не может содержать числа и специальные символы",
                    "surnameLength": "Фамилия должна быть от 2 до 50 символов",
                    "emailFormat": "Недопустимый формат адреса электронной почты",
                    "emailLength": "Адрес электронной почты не может быть пустым или длиннее 100 символов",
                    "phoneFormat": "Недопустимый номер телефона",
                    "phoneLength": "Номер телефона должен быть от 9 до 20 символов.",
                    //fix
                    "massageFormat": "",
                    "massageLength": "Выберите массаж",
                    "massageOptionFormat": "Сначала выберите массаж",
                    "massageOptionLength": "Выберите вариант массажа",
                    "dateFormat": "Выберите другую дату",
                    "dateLength": "Выберите дату",
                    "timeFormat": "Сначала выберите дату",
                    "timeLength": "Выберите время",
                    "messageLength": "Сообщение не может превышать 1000 символов",
                    "messageFormat": "Пожалуйста, не используйте следующие символы '<>`'",
                    "captchaFormat": "Потвердите что вы не робот",
                    "slots": "Извините, но мест для выбранной даты больше нет. Выберите другую дату",
                    "timeFormat3":"Чтобы просмотреть доступное время, сначала выберите массаж, продолжительность и дату.",
                    "timeFormat4":"На выбранную вами дату нет свободных мест. Пожалуйста, выберите другую дату."


                }
            }
        },
        getContactFormBackendErrorMessages: function () {
            return {
                "lt": {
                    "nameFormat": "Vardas negali turėti skaičių bei specialių simbolių",
                    "nameLength": "Vardo ilgis turi būti nuo 2 iki 100 simbolių",
                    "emailFormat": "Neteisingas elektroninio pašto adreso formatas",
                    "emailLength": "Elektroninio pašto adresas negali būti tuščias arba ilgesnis nei 100 simbolių",
                    "messageLength": "Žinutė negali viršyti 1000 simbolių",
                    "messageFormat": "Prašome nenaudoti tokių simbolių kaip '<>`'",
                    "captchaFormat": "Patvirtinkite, kad esate ne robotas",
                    "privacyPolicy": "Turite sutikti su privatumo politika"
                },
                "de": {
                    "nameFormat": "Der Name darf keine Zahlen und Sonderzeichen enthalten",
                    "nameLength": "Die Länge des Namens muss zwischen 2 und 100 Zeichen betragen",
                    "emailFormat": "Ungültiges E-Mail-Adressformat",
                    "emailLength": "Die E-Mail-Adresse darf nicht leer oder länger als 100 Zeichen sein",
                    "messageLength": "Die Nachricht darf nicht länger als 1000 Zeichen sein",
                    "messageFormat": "Bitte verwenden Sie nicht die folgenden Symbole '<>`'",
                    "captchaFormat": "Bestätigen Sie, dass Sie kein Roboter sind",
                    "privacyPolicy": "Sie müssen den Datenschutzbestimmungen zustimmen",
                    "timeFormat4":"Ner laisvu laiku, rinkis kita data"



                },
                "ru": {
                    "nameFormat": "Имя не может содержать числа и специальные символы",
                    "nameLength": "Длина имени должна быть от 2 до 100 символов",
                    "emailFormat": "Недопустимый формат адреса электронной почты",
                    "emailLength": "Адрес электронной почты не может быть пустым или длиннее 100 символов",
                    "messageLength": "Сообщение не может превышать 1000 символов",
                    "messageFormat": "Пожалуйста, не используйте следующие символы '<>`'",
                    "captchaFormat": "Потвердите что вы не робот",
                    "privacyPolicy": "Вы должны согласиться с политикой конфиденциальности"

                }
            }
        },
        getSucRespFullBookForm: function () {
            return {
                "lt": {
                    "response": "Ačiū, Jūsų laikas rezervuotas.",
                    "pending":"Rezervacija vykdoma ..."

                },
                "de": {
                    "response": "Danke, Ihre Zeit ist reserviert.",
                                        "pending":"Reservierung in Bearbeitung ..."



                },
                "ru": {
                    "response": "Спасибо, ваше время зарезервировано.",
                                        "pending":"Бронирование в процессе ..."



                }
            }
        },
                getFailRespFullBookForm: function () {
                    return {
                        "lt": {
                            "response": "Prašome užpildyti visus privalomus laukus."

                        },
                        "de": {
                            "response": "Bitte füllen Sie alle geforderten Felder aus."


                        },
                        "ru": {
                            "response": "Пожалуйста, заполните все обязательные поля."


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
        },
        getFooterInfo: function(){
        return{
        "lt":{"priv":"testas",
        "cookies":"Ši svetainė naudoja slapukus",
        "moreInfo":"Daugiau informacijos",
        "itsOk":"Sutinku",
        "privacyPolicyTitle":"Privatumo politika",
        "privacyPolicy1":"Svetainėje www.vidamassage.ch, prieinamoje iš www.vidamassage.ch, vienas iš pagrindinių mūsų prioritetų yra lankytojų privatumas. Šiame privatumo politikos dokumente yra informacijos, kurią renka ir įrašo www.vidamassage.ch, tipai ir kaip mes ją naudojame.",
        "privacyPolicy2":"Jei turite papildomų klausimų ar norite gauti daugiau informacijos apie mūsų privatumo politiką, nedvejodami susisiekite su mumis.",
        "logFiles1":"Log failai",
        "logFiles2":"www.vidamassage.ch laikosi standartinės žurnalo failų naudojimo tvarkos. Šie failai registruoja lankytojus, kai jie lankosi svetainėse. Visos prieglobos įmonės tai daro ir dalis prieglobos paslaugų analizės. Žurnalų failų surinkta informacija apima interneto protokolo (IP) adresus, naršyklės tipą, interneto paslaugų teikėją (IPT), datą ir laiko antspaudą, nukreipimo / išėjimo puslapius ir galbūt paspaudimų skaičių. Tai nėra susieta su jokia asmeniškai identifikuojama informacija. Informacijos tikslas yra analizuoti tendencijas, administruoti svetainę, sekti vartotojų judėjimą svetainėje ir rinkti demografinę informaciją.",
        "logFiles3":"",
        "cookies1":"Slapukai ir internetiniai švyturėliai",
        "cookies2":"Kaip ir bet kurioje kitoje svetainėje, www.vidamassage.ch naudoja „slapukus“. Šie slapukai naudojami informacijai, įskaitant lankytojų pageidavimus, ir tinklalapio tinklalapiams, į kuriuos lankytojas pateko ar kurį aplankė, saugoti. Informacija naudojama siekiant optimizuoti vartotojų patirtį pritaikant mūsų tinklalapio turinį atsižvelgiant į lankytojų naršyklės tipą ir (arba) kitą informaciją.",
        "cookies3":"",
        "policies1":"Privatumo politika",
        "policies2":"Šiame sąraše galite rasti kiekvieno iš www.vidamassage.ch reklamos partnerių privatumo politiką. Mūsų privatumo politika buvo sukurta pasitelkiant www.privacypolicygenerator.info privatumo politikos generatorių ir https://www.privacypolicyonline.com/ privatumo politikos generatorius / Internetinės privatumo politikos generatorius",
        "policies3":"Trečiųjų šalių skelbimų serveriai ar skelbimų tinklai naudoja tokias technologijas kaip slapukai, „JavaScript“ ar žiniatinklio švyturiai, naudojami atitinkamose reklamose ir nuorodose, rodomose www.vidamassage.ch, kurios yra tiesiogiai siunčiamos į vartotojų naršykles. Jie automatiškai gauna jūsų IP adresą, kai tai įvyksta. Šios technologijos naudojamos norint įvertinti jų reklamos kampanijų efektyvumą ir (arba) suasmeninti reklamos turinį, kurį matote jūsų lankomose svetainėse.",
        "policies4":"Atminkite, kad www.vidamassage.ch neturi prieigos prie šių slapukų, kuriuos naudoja trečiųjų šalių reklamuotojai, arba negali jų valdyti.",
        "thirdParty1":"Trečiųjų šalių privatumo politika",
        "thirdParty2":"www.vidamassage.ch privatumo politika netaikoma kitiems reklamuotojams ar svetainėms. Taigi mes patariame susipažinti su atitinkama šių trečiųjų šalių skelbimų serverių privatumo politika, kad gautumėte išsamesnės informacijos. Tai gali būti jų praktika ir instrukcijos, kaip atsisakyti tam tikrų variantų. Išsamų šių privatumo taisyklių sąrašą ir jų nuorodas galite rasti čia: Privatumo politikos nuorodos.",
        "thirdParty3":"Galite pasirinkti išjungti slapukus naudodami individualias naršyklės parinktis. Norėdami sužinoti išsamesnės informacijos apie slapukų valdymą tam tikrose interneto naršyklėse, ją galite rasti atitinkamose naršyklių svetainėse. Kas yra slapukai?",
        "childrenInfo1":"Informacija apie vaikus",
        "childrenInfo2":"Kita mūsų prioriteto dalis yra vaikų apsaugos papildymas naudojantis internetu. Mes raginame tėvus ir globėjus stebėti savo veiklą internete, joje dalyvauti ir (arba) stebėti ir (arba) stebėti jos veiklą.",
        "childrenInfo3":"www.vidamassage.ch sąmoningai nerenka jokios asmeniškai identifikuojamos informacijos iš jaunesnių nei 13 metų vaikų. Jei manote, kad jūsų vaikas pateikė tokios informacijos mūsų svetainėje, primygtinai rekomenduojame nedelsiant susisiekti su mumis ir mes padarysime viską, kas įmanoma pastangas nedelsiant pašalinti tokią informaciją iš mūsų įrašų.",
        "onlinePolicy1":"Tik internetinė privatumo politika",
        "onlinePolicy2":"Ši privatumo politika taikoma tik mūsų internetinei veiklai ir galioja mūsų svetainės lankytojams, atsižvelgiant į informaciją, kuria jie dalijosi ir (arba) renka www.vidamassage.ch. Ši politika netaikoma jokiai informacijai, surinktai neprisijungus arba per kitus kanalus, išskyrus šią svetainę.",
        "onlinePolicy3":"",
        "consent1":"Sutikimas",
        "consent2":"Naudodamiesi mūsų svetaine jūs sutinkate su mūsų privatumo politika ir sutinkate su jos nuostatomis ir nuostatomis.",
        "button1":"Uždaryti"


        },
        "de":{"priv":"testas",
        "cookies":"Diese Website verwendet Cookies",
        "moreInfo":"Mehr Info",
        "itsOk":"Genau",
                "privacyPolicyTitle":"Datenschutzerklärung für",
                "privacyPolicy1":"Auf www.vidamassage.ch, erreichbar über www.vidamassage.ch, ist die Privatsphäre unserer Besucher eine unserer Hauptprioritäten. Dieses Dokument zum Datenschutz enthält Arten von Informationen, die von www.vidamassage.ch gesammelt und aufgezeichnet werden, und wie wir sie verwenden.",
                "privacyPolicy2":"Wenn Sie weitere Fragen haben oder weitere Informationen zu unseren Datenschutzbestimmungen benötigen, zögern Sie nicht, uns zu kontaktieren.",
                "logFiles1":"Protokolldateien",
                "logFiles2":"www.vidamassage.ch folgt einem Standardverfahren zur Verwendung von Protokolldateien. Diese Dateien protokollieren Besucher, wenn sie Websites besuchen. Alle Hosting-Unternehmen tun dies und einen Teil der Analyse der Hosting-Services. Die von Protokolldateien gesammelten Informationen umfassen IP-Adressen (Internet Protocol), Browsertyp, Internetdienstanbieter (Internet Service Provider, ISP), Datums- und Zeitstempel, Verweis- / Beendigungsseiten und möglicherweise die Anzahl der Klicks. Diese sind nicht mit personenbezogenen Daten verknüpft. Der Zweck der Informationen besteht darin, Trends zu analysieren, die Website zu verwalten, die Bewegungen der Benutzer auf der Website zu verfolgen und demografische Informationen zu sammeln.",
                "logFiles3":"",
                "cookies1":"Cookies und Web Beacons",
                "cookies2":"www.vidamassage.ch verwendet wie jede andere Website sogenannte Cookies. Diese Cookies werden verwendet, um Informationen zu speichern, einschließlich der Vorlieben der Besucher und der Seiten auf der Website, auf die der Besucher zugegriffen oder die er besucht hat. Die Informationen werden verwendet, um die Benutzererfahrung zu optimieren, indem der Inhalt unserer Webseiten basierend auf dem Browsertyp der Besucher und / oder anderen Informationen angepasst wird.",
                "cookies3":"",
                "policies1":"Datenschutzrichtlinien",
                "policies2":"In dieser Liste finden Sie die Datenschutzbestimmungen für jeden Werbepartner von www.vidamassage.ch. Unsere Datenschutzrichtlinie wurde mit Hilfe des https://www.privacypolicygenerator.info Generators für Datenschutzrichtlinien und des https://www.privacypolicyonline.com/ erstellt. privacy-policy-generator / Online-Generator für Datenschutzrichtlinien",
                "policies3":"Ad-Server oder Ad-Netzwerke von Drittanbietern verwenden Technologien wie Cookies, JavaScript oder Web Beacons, die in ihren jeweiligen Anzeigen verwendet werden, und Links, die auf www.vidamassage.ch erscheinen und direkt an den Browser der Benutzer gesendet werden. Sie erhalten in diesem Fall automatisch Ihre IP-Adresse. Diese Technologien werden verwendet, um die Wirksamkeit ihrer Werbekampagnen zu messen und / oder den Werbeinhalt, den Sie auf von Ihnen besuchten Websites sehen, zu personalisieren.",
                "policies4":"Beachten Sie, dass www.vidamassage.ch keinen Zugriff auf oder keine Kontrolle über diese Cookies hat, die von Werbekunden Dritter verwendet werden.",
                "thirdParty1":"Datenschutzrichtlinien von Drittanbietern",
                "thirdParty2":"Die Datenschutzerklärung von www.vidamassage.ch gilt nicht für andere Inserenten oder Websites. Aus diesem Grund empfehlen wir Ihnen, die jeweiligen Datenschutzrichtlinien dieser Ad-Server von Drittanbietern zu Rate zu ziehen, um detailliertere Informationen zu erhalten. Es kann ihre Vorgehensweisen und Anweisungen zum Deaktivieren bestimmter Optionen enthalten. Eine vollständige Liste dieser Datenschutzrichtlinien und ihrer Links finden Sie hier: Datenschutzrichtlinien-Links.",
                "thirdParty3":"Sie können Cookies über Ihre individuellen Browseroptionen deaktivieren. Ausführlichere Informationen zur Cookie-Verwaltung mit bestimmten Webbrowsern finden Sie auf den jeweiligen Websites der Browser. Was sind Cookies?",
                "childrenInfo1":"Informationen über Kinder",
                "childrenInfo2":"Ein weiterer Schwerpunkt liegt auf dem Schutz von Kindern bei der Nutzung des Internets. Wir ermutigen Eltern und Erziehungsberechtigte, ihre Online-Aktivitäten zu beobachten, daran teilzunehmen und / oder zu überwachen und zu leiten.",
                "childrenInfo3":"www.vidamassage.ch sammelt wissentlich keine personenbezogenen Daten von Kindern unter 13 Jahren. Wenn Sie der Meinung sind, dass Ihr Kind diese Informationen auf unserer Website zur Verfügung gestellt hat, empfehlen wir Ihnen dringend, uns unverzüglich zu kontaktieren, und wir werden unser Bestes tun bemüht sich, solche Informationen umgehend aus unseren Unterlagen zu entfernen.",
                "onlinePolicy1":"Nur Online-Datenschutzbestimmungen",
                "onlinePolicy2":"Diese Datenschutzerklärung gilt nur für unsere Online-Aktivitäten und gilt für Besucher unserer Website in Bezug auf die Informationen, die sie in www.vidamassage.ch geteilt und / oder gesammelt haben. Diese Richtlinie gilt nicht für Informationen, die offline oder über andere Kanäle als diese Website erfasst werden.",
                "onlinePolicy3":"",
                "consent1":"Zustimmung",
                "consent2":"Durch die Nutzung unserer Website erklären Sie sich hiermit mit unseren Datenschutzbestimmungen einverstanden und stimmen deren Nutzungsbedingungen zu.",
                "button1":"Schließen"
        },
        "ru":{"priv":"testas",
        "cookies":"Этот сайт использует куки",
        "moreInfo":"Больше информации",
        "itsOk":"Я согласен",
                "privacyPolicyTitle":"Политика конфиденциальности для",
                "privacyPolicy1":"На сайте www.vidamassage.ch, доступном по адресу www.vidamassage.ch, одним из наших главных приоритетов является конфиденциальность наших посетителей. Этот документ о политике конфиденциальности содержит типы информации, которая собирается и регистрируется www.vidamassage.ch, и способы ее использования.",
                "privacyPolicy2":"Если у вас есть дополнительные вопросы или вам нужна дополнительная информация о нашей Политике конфиденциальности, не стесняйтесь обращаться к нам.",
                "logFiles1":"Лог-файлы",
                "logFiles2":"www.vidamassage.ch следует стандартной процедуре использования файлов журналов. Эти файлы регистрируют посетителей, когда они посещают веб-сайты. Все хостинговые компании делают это и часть аналитики хостинговых услуг. Информация, собираемая файлами журналов, включает адреса интернет-протокола (IP), тип браузера, поставщика услуг Интернета (ISP), отметку даты и времени, страницы перехода / выхода и, возможно, количество кликов. Они не связаны с какой-либо информацией, позволяющей установить личность. Целью этой информации является анализ тенденций, администрирование сайта, отслеживание движения пользователей на сайте и сбор демографической информации.",
                "logFiles3":"",
                "cookies1":"Cookies и веб-маяки",
                "cookies2":"Как и любой другой сайт, www.vidamassage.ch использует «куки». Эти файлы cookie используются для хранения информации, включая предпочтения посетителей и страницы на веб-сайте, которые посетитель посещал или посещал. Эта информация используется для оптимизации работы пользователей путем настройки содержимого нашей веб-страницы на основе типа браузера посетителей и / или другой информации.",
                "cookies3":"",
                "policies1":"Политика конфиденциальности",
                "policies2":"Вы можете ознакомиться с этим списком, чтобы найти Политику конфиденциальности для каждого из рекламных партнеров www.vidamassage.ch. Наша Политика конфиденциальности была создана с помощью https://www.privacypolicygenerator.info Генератора политики конфиденциальности  и https://www.privacypolicyonline.com/ privacy-policy-generator / Генератор политики конфиденциальности в Интернете",
                "policies3":"Сторонние рекламные серверы или рекламные сети используют такие технологии, как файлы cookie, JavaScript или веб-маяки, которые используются в их соответствующих рекламных объявлениях и ссылках, которые появляются на сайте www.vidamassage.ch, которые отправляются непосредственно в браузер пользователей. Они автоматически получают ваш IP-адрес, когда это происходит. Эти технологии используются для измерения эффективности их рекламных кампаний и / или для персонализации рекламного контента, который вы видите на посещаемых вами веб-сайтах.",
                "policies4":"Обратите внимание, что www.vidamassage.ch не имеет доступа или контроля над этими файлами cookie, которые используются сторонними рекламодателями.",
                "thirdParty1":"Политика конфиденциальности третьих лиц",
                "thirdParty2":"Политика конфиденциальности www.vidamassage.ch не распространяется на других рекламодателей или веб-сайты. Поэтому мы советуем вам ознакомиться с соответствующей политикой конфиденциальности этих сторонних рекламных серверов для получения более подробной информации. Это может включать их методы и инструкции о том, как отказаться от определенных вариантов. Вы можете найти полный список этих политик конфиденциальности и их ссылки здесь: Ссылки на политику конфиденциальности.",
                "thirdParty3":"Вы можете отключить куки-файлы в настройках вашего браузера. Чтобы узнать более подробную информацию об управлении cookie-файлами в определенных веб-браузерах, ее можно найти на соответствующих веб-сайтах браузеров. Что такое печенье?",
                "childrenInfo1":"Информация о детях",
                "childrenInfo2":"Еще одной частью нашего приоритета является добавление защиты детей при использовании Интернета. Мы призываем родителей и опекунов наблюдать, участвовать и / или отслеживать и направлять их деятельность в Интернете.",
                "childrenInfo3":"www.vidamassage.ch сознательно не собирает личную информацию от детей в возрасте до 13 лет. Если вы считаете, что ваш ребенок предоставил такую информацию на нашем сайте, мы настоятельно рекомендуем вам немедленно связаться с нами, и мы сделаем все возможное, усилия по оперативному удалению такой информации из наших записей.",
                "onlinePolicy1":"Только политика конфиденциальности онлайн",
                "onlinePolicy2":"Настоящая Политика конфиденциальности применяется только к нашей онлайн-деятельности и действительна для посетителей нашего веб-сайта в отношении информации, которой они поделились и / или собрали на www.vidamassage.ch. Эта политика не распространяется на любую информацию, собранную в автономном режиме или по каналам, отличным от данного веб-сайта.",
                "onlinePolicy3":"",
                "consent1":"Cогласие",
                "consent2":"Используя наш сайт, вы тем самым соглашаетесь с нашей Политикой конфиденциальности и соглашаетесь с ее Условиями.",
                "button1":"Закрыть"
        }}}

    }

});
















