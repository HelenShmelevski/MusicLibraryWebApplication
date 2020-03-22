export class AddArtistServise {

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

  addArtist(id: number, name:string, genre: string){
    this.artists.push({id, name, genre});
  }
}
