export class CreateService {
  artists = [
    {
      id: 12,
      name: 'Билан',
      genre: 'pop'
    },
    {
      id: 12,
      name: 'sgreg',
      genre: 'hdthd'
    },
    {
      id: 12,
      name: 'rgrh',
      genre: 'pop'
    },
    {
      id: 12,
      name: 'hthtnt',
      genre: 'pop'
    },
    {
      id: 12,
      name: 'Билан',
      genre: 'pop'
    }
  ];
  genres = [
    {
      id: 1,
      title: 'pop',
      name: 'Билан'
    },
    {
      id: 2,
      title: 'rap',
      name: 'Баста'
    },
    {
      id: 3,
      title: 'lyrics',
      name: 'Монатик'
    },

  ];
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


  addArtist(id: number, name: string, genre: string) {
    this.artists.push({id, name, genre});
  }

  addGenre(id: number, title: string, name: string) {
    this.genres.push({id, title, name});
  }

  addTrack(id: number, name: string, title: string, genre: string, duration: number) {
    this.tracks.push({id, name, title, genre, duration});
  }
}
