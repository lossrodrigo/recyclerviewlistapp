package com.example.recyclerviewlistapp

data class Contact(val name: String,
                   val phoneNumber: String)


fun fakeList(): List<Contact> {
    return listOf(
        Contact(
            "Amelie",
            "11-111-2222"
        ),
        Contact(
            "Bruno",
            "11-999-8888"
        ),
        Contact(
            "Cryslaine",
            "72-989-5588"
        ),
        Contact(
            "David",
            "11-987-8880"
        ),
        Contact(
            "Francine",
            "32-879-8888"
        ),
        Contact(
            "Gabriel",
            "11-121-2222"
        ),
        Contact(
            "Jake",
            "11-901-1234"
        ),
        Contact(
            "Louise",
            "98-900-5588"
        ),
        Contact(
            "Paul",
            "81-357-8880"
        ),
    )
}
