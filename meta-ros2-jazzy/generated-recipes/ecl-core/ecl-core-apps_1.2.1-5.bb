# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "This includes a suite of programs demo'ing various aspects of the      ecl_core. It also includes various benchmarking and utility programs for      use primarily with embedded systems."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_core_apps"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_core"
ROS_BPN = "ecl_core_apps"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-command-line \
    ecl-config \
    ecl-containers \
    ecl-converters \
    ecl-devices \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-geometry \
    ecl-ipc \
    ecl-license \
    ecl-linear-algebra \
    ecl-sigslots \
    ecl-streams \
    ecl-threads \
    ecl-time-lite \
    ecl-type-traits \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-build \
    ecl-command-line \
    ecl-config \
    ecl-containers \
    ecl-converters \
    ecl-devices \
    ecl-errors \
    ecl-exceptions \
    ecl-formatters \
    ecl-geometry \
    ecl-ipc \
    ecl-license \
    ecl-linear-algebra \
    ecl-sigslots \
    ecl-streams \
    ecl-threads \
    ecl-time-lite \
    ecl-type-traits \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/ecl_core-release/archive/release/jazzy/ecl_core_apps/1.2.1-5.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/ecl_core_apps"
SRC_URI = "git://github.com/ros2-gbp/ecl_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "ba34ad25a3cf2830523653dfcf6428cc69b26adb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
