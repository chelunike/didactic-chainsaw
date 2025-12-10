package ctf;
use Moo;
use strictures 2;
use namespace::clean;


use Types::Standard qw(ENum Str); #Import Enum

has type => (  #Challenge type
    is => 'ro',
    isa => Enum[
        'criptografía',
        'ingeniería inversa',
        'web',
        'pwn'
    ],
);

has ip => ( # System Ip
    is => 'ro',
);

has port => ( #System Port
    is => 'ro',
);

1;