export class AddGenreServise {
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
  addGenre(id: number, title:string, name: string){
    this.genres.push({id, title, name});
  }
}
