export default function LearningJavaScript() {

  const person = {
    name: 'Habibur Rahman',
    address: {
      line1: 'Baker Street',
      line2: 'UK',
      country: 'BD'
    },
    proofiles: ['twiter', 'linkedin', 'instagram'],
    printProfiles: () => {
      person.proofiles.map(
        profile => {
          console.log(profile)
        }
      )
    }
  }

  return (
    <>
    <div>Learning Java {person.name}</div>
    <div>Address: {person.address.country}</div>
    <div>{person.printProfiles()}</div>
    </>
  )

}