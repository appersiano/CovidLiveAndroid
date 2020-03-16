/*
 *
 * Copyright (C) 2019 ZeHus S.p.A. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Project: MyBike - Gen2
 * Written by Alessandro Persiano - 5/12/2019
 */

package com.appersiano.covid.util

data class FAQ(var title: String, var description: String)


class FactoryCreator {

    fun getFaq(): List<FAQ> {
        val listFAQ = mutableListOf<FAQ>()

        listFAQ.add(
            FAQ(
                "Posso muovermi in Italia?",
                "Non si può uscire di casa se non per validi motivi." +
                        "\nLe limitazioni agli spostamenti sono le stesse in tutte le Regioni italiane e sono in vigore dal 10 marzo e fino al 3 aprile 2020." +
                        "\n\nCi saranno controlli da parte delle forze di Polizia. E’ previsto il divieto assoluto di uscire di casa per chi è sottoposto a quarantena o risulti positivo al virus. In caso di sintomi da infezione respiratoria o febbre superiore a 37,5 gradi è fortemente raccomandato di rimanere a casa, di rivolgersi al proprio medico e di limitare al massimo il contatto con altre persone."
            )
        )
        listFAQ.add(
            FAQ(
                "Quali sono i validi motivi per uscire di casa?",
                "Si può uscire di casa per andare a lavoro, per ragioni di salute o situazioni di necessità." +
                        "\n\nPer provare queste esigenze dovrà essere compilata un’autodichiarazione che potrà essere resa anche seduta stante sui moduli in dotazione alle forze di Polizia." +
                        "\n\nLa veridicità delle dichiarazioni sarà oggetto di controlli successivi."
            )
        )
        listFAQ.add(
            FAQ(
                "Chi si trova fuori dal proprio 3 domicilio, abitazione o residenza può rientravi?    ",
                "Sì, fermo restando che poi si potrà spostare solo per esigenze lavorative, situazioni di necessità e motivi di salute."
            )
        )
        listFAQ.add(
            FAQ(
                "Se abito in un comune e lavoro in altro posso fare avanti e indietro?",
                "Sì, se è uno spostamento giustificato per esigenze lavorative"
            )
        )
        listFAQ.add(
            FAQ(
                "Posso utilizzare i mezzi di trasporto pubblico?",
                "Nessun blocco dei trasporti. Tutti i mezzi di trasporto pubblico, e anche privato, funzionano regolarmente."
            )
        )
        listFAQ.add(
            FAQ(
                "Si può uscire per acquistare beni diversi da quelli alimentari?",
                "Sì, ma solo in caso di stretta necessità, quindi unicamente per l’acquisto di beni legati ad esigenze primarie non rimandabili."
            )
        )
        listFAQ.add(
            FAQ(
                "Posso andare a mangiare dai parenti?",
                "No, perché non è uno spostamento necessario e quindi non rientra tra quelli ammessi."
            )
        )
        listFAQ.add(
            FAQ(
                "Posso andare ad assistere i miei cari anziani non autosufficienti?",
                "Sì. Ricordate però che gli anziani sono le persone più vulnerabili e quindi cercate di proteggerli il più possibile dai contatti."
            )
        )
        listFAQ.add(
            FAQ(
                "È consentito fare attività motoria all’aperto?",
                "Lo sport e le attività motorie svolte negli spazi aperti sono ammessi nel rispetto della distanza interpersonale di un metro. In ogni caso bisogna evitare assembramenti."
            )
        )
        listFAQ.add(
            FAQ(
                "Posso uscire con il mio cane?",
                "Sì, per la gestione quotidiana delle sue esigenze fisiologiche e per i controlli veterinari."
            )
        )
        listFAQ.add(
            FAQ(
                "Che succede a chi non rispetta le limitazioni?",
                "La violazione delle prescrizioni è punita con l'arresto fino a tre mesi o con l'ammenda fino a 206 euro, secondo quanto previsto dall'articolo 650 del codice penale sull'inosservanza di un provvedimento di un'autorità.\n\nMa pene più severe possono essere comminate a chi adotterà comportamenti che configurino più gravi ipotesi di reato."
            )
        )
        listFAQ.add(
            FAQ(
                "Quali sono le misure previste in Italia?",
                "Ai cittadini della regione Lombardia e delle province di Modena, Parma, Piacenza, Reggio nell’Emilia, Rimini, Pesaro e Urbino, Alessandria, Asti, Novara, Verbano-Cusio-Ossola, Vercelli, Padova, Treviso e Venezia si chiede soprattutto di:\n" +
                        "\n" +
                        "- evitare gli spostamenti in entrata e in uscita da questi territori, salvo quelli per esigenze lavorative o motivi di salute\n" +
                        "\n- ai soggetti con febbre superiore a 37,5 gradi è fortemente raccomandato di rimanere a casa e limitare al massimo i contatti sociali e di contattare il proprio medico curante\n" +
                        "\n- divieto assoluto di uscire dalla propria abitazione per chi è sottoposto alla quarantena o è risultato positivo al virus."
            )
        )
        listFAQ.add(
            FAQ(
                "Cosa si raccomanda a tutti i cittadini italiani e soprattutto alle persone anziane?",
                "A tutti i cittadini sull'intero territorio nazionale:\n" +
                        "\n" +
                        "\n- è fatta espressa raccomandazione a tutte le persone anziane o affette da patologie croniche o con multi morbilità ovvero con stati di immunodepressione congenita o acquisita, di evitare di uscire dalla propria abitazione o dimora fuori dai casi di stretta necessità e di evitare comunque luoghi affollati nei quali non sia possibile mantenere la distanza di sicurezza interpersonale di almeno un metro;\n" +
                        "\n- si raccomanda di limitare, ove possibile, gli spostamenti delle persone fisiche ai casi strettamente necessari;\n" +
                        "\n- ai soggetti con sintomatologia da infezione respiratoria e febbre (maggiore di 37,5° C) è fortemente raccomandato di rimanere presso il proprio domicilio e di limitare al massimo i contatti sociali, contattando il proprio medico curante;\n" +
                        "\n- chiunque, a partire dal quattordicesimo giorno antecedente la data di pubblicazione del DPCM 8 marzo, abbia fatto ingresso in Italia dopo aver soggiornato in zone a rischio epidemiologico, come identificate dall'Organizzazione mondiale della sanità, deve comunicare tale circostanza al Dipartimento di prevenzione dell'azienda sanitaria competente per territorio nonché al proprio medico di medicina generale ovvero al pediatra di libera scelta\n" +
                        "\n-le persone per le quali la Dipartimento di prevenzione della Asl accerta la necessità di avviare la sorveglianza sanitaria e l’isolamento fiduciario devono:\n" +
                        "\n > mantenere lo stato di isolamento per quattordici giorni dall'ultima esposizione\n" +
                        "\n > divieto di contatti sociali\n" +
                        "\n > divieto di spostamenti e via\n" +
                        "\n > obbligo di rimanere raggiungibile per le attività di sorveglianza.\n" +
                        "\n- in caso di comparsa di sintomi la persona in sorveglianza deve:\n" +
                        "\n > avvertire immediatamente il medico di medicina generale o il pediatra di libera scelta e l'operatore di Sanità Pubblica;\n" +
                        "\n > indossare la mascherina chirurgica fornita all'avvio della sorveglianza sanitaria\n" +
                        "\n > e allontanarsi dagli altri conviventi; rimanere nella propria stanza con la porta chiusa garantendo un'adeguata ventilazione naturale, in attesa del trasferimento in ospedale, ove necessario.\n" +
                        "\n- Rispetta inoltre queste semplici raccomandazioni per la prevenzione."
            )
        )

        listFAQ.add(
            FAQ(
                "Che cos'è un Coronavirus?",
                "I Coronavirus sono una vasta famiglia di virus noti per causare malattie che vanno dal comune raffreddore a malattie più gravi come la Sindrome respiratoria mediorientale (MERS) e la Sindrome respiratoria acuta grave (SARS).\n\nSono virus RNA a filamento positivo, con aspetto simile a una corona al microscopio elettronico. La sottofamiglia Orthocoronavirinae della famiglia Coronaviridae è classificata in quattro generi di coronavirus (CoV): Alpha-, Beta-, Delta-- e Gammacoronavirus.\n\nIl genere del betacoronavirus è ulteriormente separato in cinque sottogeneri (tra i quali il Sarbecovirus). I Coronavirus sono stati identificati a metà degli anni '60 e sono noti per infettare l'uomo ed alcuni animali (inclusi uccelli e mammiferi). Le cellule bersaglio primarie sono quelle epiteliali del tratto respiratorio e gastrointestinale. Ad oggi, sette Coronavirus hanno dimostrato di essere in grado di infettare l'uomo:\n" +
                        "\n" +
                        "Coronavirus umani comuni: HCoV-OC43 e HCoV-HKU1 (Betacoronavirus) e HCoV-229E e HCoV-NL63 (Alphacoronavirus); essi possono causare raffreddori comuni ma anche gravi infezioni del tratto respiratorio inferiore\n" +
                        "altri Coronavirus umani (Betacoronavirus): SARS-CoV, MERS-CoV e 2019-nCoV (ora denominato SARS-CoV-2)."
            )
        )

        listFAQ.add(
            FAQ(
                "Cosa è la COVID-19?",
                "La malattia provocata dal nuovo Coronavirus ha un nome: “COVID-19” (dove \"CO\" sta per corona, \"VI\" per virus, \"D\" per disease e \"19\" indica l'anno in cui si è manifestata). Lo ha annunciato, l’11 febbraio 2020, nel briefing con la stampa durante una pausa del Forum straordinario dedicato al virus, il Direttore generale dell’Oms Tedros Adhanom Ghebreyesus."
            )
        )

        listFAQ.add(
            FAQ(
                "Come si diffonde il nuovo Coronavirus?",
                "Il nuovo coronavirus è un virus respiratorio che si diffonde principalmente attraverso il contatto con le goccioline del respiro delle persone infette, ad esempio quando starnutiscono o tossiscono o si soffiano il naso. È importante perciò che le persone ammalate applichino misure di igiene quali starnutire o tossire in un fazzoletto o con il gomito flesso e gettare i fazzoletti utilizzati in un cestino chiuso immediatamente dopo l'uso e lavare le mani frequentemente con acqua e sapone o usando soluzioni alcoliche."
            )
        )

        listFAQ.add(
            FAQ(
                "Quali sono le regole per la disinfezione / lavaggio delle mani?",
                "Il lavaggio e la disinfezione delle mani sono la chiave per prevenire l'infezione. Dovresti lavarti le mani spesso e accuratamente con acqua e sapone per almeno 60 secondi. Se non sono disponibili acqua e sapone, è possibile utilizzare anche un disinfettante per mani a base di alcool (concentrazione di alcool di almeno il 60%)."
            )
        )

        listFAQ.add(
            FAQ(
                "Cosa posso fare per proteggermi?",
                "Mantieniti informato sulla diffusione dell’epidemia, disponibile sul sito dell'OMS e sul sito del ministero e adotta le seguenti misure di protezione personale:\n" +
                        "\n" +
                        "lavati spesso le mani con acqua e sapone o con soluzioni a base di alcol per eliminare il virus dalle tue mani\n" +
                        "mantieni una certa distanza – almeno due metri– dalle altre persone quando tossiscono o starnutiscono o se hanno la febbre, perché il virus è contenuto nelle goccioline di saliva e può essere trasmesso col respiro a distanza ravvicinata\n" +
                        "evita di toccarti occhi, naso e bocca con le mani se presenti febbre, tosse o difficoltà respiratorie   \n" +
                        "Se presenti febbre, tosse o difficoltà respiratorie e sospetti di essere stato in stretto contatto con una persona affetta da malattia respiratoria Covid-19:\n" +
                        "\n" +
                        "rimani in casa, non recarti al pronto soccorso o presso gli studi medici ma chiama al telefono il tuo medico di famiglia, il tuo pediatra o la guardia medica. Oppure chiama il numero verde regionale. Utilizza i numeri di emergenza 112/118 soltanto se strettamente necessario. \n" +
                        "Ricorda che per tutte le persone che rientrano dai viaggi dalle zone a rischio negli ultimi 14 giorni c'è obbligo di isolamento domiciliare fiduciario e di comunicazione al Dipartimento di prevenzione della propria ASL.  Vedi anche la sezione Viaggi."
            )
        )

        return listFAQ
    }
}