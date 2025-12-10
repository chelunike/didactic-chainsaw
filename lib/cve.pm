package cve; 
use Moo;
use strictures 2;
use namespace::clean; #follow good perl practices


use Types::Common::String qw(NonEmptyStr); #Type: NonEMptyStr
use Types::Standard qw(ArrayRef); #Type ArrayRef

has description => ( # CVE description
    is => 'ro',
    isa => NonEmptyStr,  # is not a empty string
    required => 1,  
);

has links => ( # CVE links
    is =>'ro',
    isa => ArrayRef[NonEmptyStr],
    required => 1,
);

1;