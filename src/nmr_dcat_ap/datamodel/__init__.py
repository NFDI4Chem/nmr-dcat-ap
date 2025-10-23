from pathlib import Path
from .nmr_dcat_ap import *

THIS_PATH = Path(__file__).parent

SCHEMA_DIRECTORY = THIS_PATH.parent / "schema"
MAIN_SCHEMA_PATH = SCHEMA_DIRECTORY / "nmr_dcat_ap.yaml"
