export class AddTrackService {
  tracks = [
    {
      id: 12,
      name: 'Билан',
      title: 'любовная любовь',
      genre: 'pop',
      duration: 5
    },
    {
      id: 12,
      name: 'sgreg',
      title: 'любовная любовь',
      genre: 'hdthd',
      duration: 5
    },
    {
      id: 12,
      name: 'rgrh',
      genre: 'pop',
      duration: 5
    },
    {
      id: 12,
      name: 'hthtnt',
      title: 'любовная любовь',
      genre: 'pop',
      duration: 5
    },
    {
      id: 12,
      name: 'Билан',
      title: 'любовная любовь',
      genre: 'pop',
      duration: 5
    }
  ];

  addTrack(id: number, name:string, title: string,  genre: string, duration: number){
    this.tracks.push({id, name, title, genre, duration});
  }
}

